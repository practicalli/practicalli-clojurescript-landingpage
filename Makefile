# ------------------------------------------
# Fraud API Service: Makefile
#
# Consistent set of targets to support local development of Clojure
# and build the Clojure service during CI deployment
#
# Used by Jenkins pipeline from within Docker container
# to efficiently test and build the service
# using the Billie shared library cache (maven, node, etc.)
# ------------------------------------------

# Jenkins pipeline automatically mounts a shared `~/.m2/` repository
# so tasks will used cached library files when resolving dependencies

# .PHONY: ensures target used rather than matching file name
# https://makefiletutorial.com/#phony
.PHONY: all lint deps dist docs pre-commit-check repl test test-ci test-watch clean


# ------- Makefile Variables --------- #

# run help if no target specified
.DEFAULT_GOAL := help

# Column the target description is printed from
HELP-DESCRIPTION-SPACING := 24

# Example variables (not currently used)
SWAGGER-EDITOR-DOCKER-IMAGE := swaggerapi/swagger-editor
DOCKER-FRAUD-API-SERVICE := fraud-api-service

# Makefile file and directory name wildcard
EDN-FILES := $(wildcard *.edn)

# ------------------------------------ #


# ------- Help ----------------------- #

# Source: https://nedbatchelder.com/blog/201804/makefile_help_target.html

help:  ## Describe available tasks in Makefile
	@grep '^[a-zA-Z]' $(MAKEFILE_LIST) | \
	sort | \
	awk -F ':.*?## ' 'NF==2 {printf "\033[36m  %-$(HELP-DESCRIPTION-SPACING)s\033[0m %s\n", $$1, $$2}'

# ------------------------------------ #


# ------- Clojure Development -------- #

repl:  ## Run Clojure REPL with rich terminal UI (Rebel Readline)
	$(info --------- Run Rebel REPL ---------)
	clojure -M:env/figwheel:build/dev 


deps: deps.edn  ## Prepare dependencies for test and dist targets
	$(info --------- Download libraries to test and build the service ---------)
	clojure -P -X:env/test:package/uberjar

build:
	$(info --------- Build and Package Clojure service ---------)
	clojure -M:env/figwheel:build/dev

dist:  ## Build and package Clojure service
	$(info --------- Build and Package Clojure service ---------)
	$(info Prerequisites newer than target)
	clojure -M:env/figwheel:build/minify


# Remove files and directories after build tasks
# `-` before the command ignores any errors returned
clean:  ## Clean build temporary files
	$(info --------- Clean Clojure classpath cache ---------)
	- rm -rf ./.cpcache

# ------------------------------------ #


# ------- Testing -------------------- #

# TODO: focus runner on `:unit` tests
test:  ## Run unit tests - stoping on first error
	$(info --------- Runner for unit tests ---------)
	clojure -X:env/test:test/run

test-all:  ## Run all unit tests regardless of failing tests
	$(info --------- Runner for all unit tests ---------)
	clojure -X:env/test:test/run :fail-fast? false

test-watch:  ## Run tests when changes saved, stopping test run on first error
	$(info --------- Watcher for unit tests ---------)
	clojure -X:env/test:test/run :watch? true

test-watch-all:  ## Run all tests when changes saved, regardless of failing tests
	$(info --------- Watcher for unit tests ---------)
	clojure -X:env/test:test/run :fail-fast? false :watch? true

# ------------------------------------ #


# ------- Code Quality --------------- #

pre-commit-check: format-check lint test dist ## format & lint, run tests & build


format-check: ## Run cljstyle to check the formatting of Clojure code
	$(info --------- cljstyle Runner ---------)
	cljstyle check


format-fix:  ## Run cljstyle and fix the formatting of Clojure code
	$(info --------- cljstyle Runner ---------)
	cljstyle fix


lint:  ## Run MegaLinter with custom configuration
	$(info --------- MegaLinter Runner ---------)
	mega-linter-runner --flavor java --env 'MEGALINTER_CONFIG=.github/linters/mega-linter.yml'

lint-clean:  ## Clean MegaLinter report information
	$(info --------- MegaLinter Clean Reports ---------)
	- rm -rf ./megalinter-reports

# ------------------------------------ #


# ------- Documentation Generation ---------- #

docs:  ## Run mkdocs local server
	$(info --------- Mkdocs Local Server ---------)
	mkdocs serve --dev-addr localhost:7777

# ------------------------------------ #


# ------- Docker Containers ---------- #

docker-build:  ## Build Fraud API Service with docker compose
	$(info --------- Docker Compose Build ---------)
	docker compose up --build

docker-build-clean:  ## Build Fraud API Service with docker compose, removing orphans
	$(info --------- Docker Compose Build - remove orphans ---------)
	docker compose up --build --remove-orphans

docker-down:  ## Shut down Fraud API service using docker compose
	$(info --------- Docker Compose Down ---------)
	docker compose down

docker-inspect:  ## Inspect given docker image - image-id=12e45fg89
	$(info --------- Docker Image Prune ---------)
	docker inspect --format='{{json .Config}}' $(image-id) | jq

docker-image-prune:  ## Prune docker images
	$(info --------- Docker Image Prune ---------)
	docker image prune

docker-container-prune:  ## Prune docker containers
	$(info --------- Docker Container Prune ---------)
	docker container prune

docker-prune: docker-image-prune docker-image-prune  ## Prune docker images and containers


swagger-editor:  ## Start Swagger Editor in Docker
	$(info --------- Run Swagger Editor at locahost:8282 ---------)
	docker compose -f swagger-editor.yml up -d swagger-editor

swagger-editor-down:  ## Stop Swagger Editor in Docker
	$(info --------- Run Swagger Editor at locahost:8282 ---------)
	docker compose -f swagger-editor.yml down

# ------------------------------------ #


# ------ Continuous Integration ------ #

# .DELETE_ON_ERROR: halts if command returns non-zero exit status
# https://makefiletutorial.com/#delete_on_error


# TODO: focus runner on ^:integration` tests
test-ci:  ## Test runner for integration tests
	$(info --------- Runner for integration tests ---------)
	clojure -X:env/test:test/run


# Run tests, build & package the Clojure code and clean up afterward
# `make all` used in Docker builder stage
.DELETE_ON_ERROR:
all: test-ci dist clean  ## Call test-ci dist and clean targets, used for CI

# ------------------------------------ #
