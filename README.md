# Practicalli Landing Page

The website brings together all the content created for the Practicalli series on Functional programming with Clojure.

## Overview

This web page was created with ClojureScript, reagent, figwheel-main and Bulma CSS framework.

The project was created with Leiningen build tool and using the figwheel-main template, with reagent option.  A Clojure CLI tools configuration has also been added.


## Development

To get an interactive development environment run:

### Run via Spacemacs

Open one of the ClojureScript source code files, e.g. `src/practicalli/landing_page.cljs`

`, m s` to run `sesman-start` and select the `cider-jack-in-cljs` option

Select `figwheel-main` when prompted for build tool

Select `dev` when prompted for the profile


### Run via the command line

Open a terminal and run the following command to start a REPL

    clojure -A:fig:build

This will auto compile and send all changes to the browser without the need to reload. After the compilation process is complete, you will get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    rm -rf target/public

To create a production build run:

    lein fig:live
    clojure -M:fig:min


> The fig:live build will write the generated javascript code in the `/docs/cljs-out/dev-main.js` file.


## Running tests
TODO: add some tests
- check that the relevant sections are added
- check a section is returning the right form / structure


### Deploying to Test

Copy the following files and directories to the `/docs` directory:

- `resources/public/index.html`
- `resources/public/css`
- `resources/public/images`

Committing these files in the `/docs` directory will update [the test environment for this project](https://practicalli.github.io/practicalli-landing-page/), allowing deployed changes to be viewed before pushing to live.


## Automated Deploy via GitHub Actions

`.github/workflows/deploy.yml` defines a GitHub Actions workflow to deploy on any commit to the `live` branch, including pull requests merged to that branch.

`clojure -M:fig:live` command is called to compile the ClojureScript code into an advanced compiled JavaScript file and written to the `docs` directory.

The GitHub Action deploys the contents of `docs` directory to the root of the `gh-pages` branch


### Manual Deploy to Live

Clone the `practicalli.github.io` repository

`git clone git@github.com:practicalli/practicalli.github.io.git`

Copy all files and directories from the `/docs` directory to the root of that repository.

`cp -ruv ../practicalli-landing-page/docs/* .`

> Note: option r for recursive, u for update so only newer files are copied and v for verbose to show what files are copied.

## License

Copyright © 2019 Practicalli / jr0cket

Distributed under the Creative Commons Attribution Share-Alike 4.0 International
