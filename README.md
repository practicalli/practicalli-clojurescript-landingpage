# Practicalli Landing Page

The website brings together all the content created for the Practicalli series on Functional programming with Clojure.

## Overview

This web page was created with ClojureScript, reagent, figwheel-main and Bulma CSS framework.

The project was created with Leiningen build tool and using the figwheel-main template, with reagent option.  A Clojure CLI tools configuration has also been added.


## Development

To get an interactive development environment run the following command in a terminal:

```shell
clojure -M:env/figwheel:build/dev
```



### Run via Spacemacs

Open one of the ClojureScript source code files, e.g. `src/practicalli/landing_page.cljs`

`, m s` to run `sesman-start` and select the `cider-jack-in-cljs` option

The `.dir-locals.el` configuration file sets the build tool to be `figwheel-main` and the build profile to be `dev` (loading the `dev.cljs.edn` build file)


### Run via the command line

Open a terminal and run the following command to start a REPL

    clojure -M:env/figwheel:build/dev

This will auto compile and send all changes to the browser without the need to reload. After the compilation process is complete, you will get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    rm -rf target/public

Use the `:build/minify` for advanced compilation and a minified JavaScript file:

    clojure -M:env/figwheel:build/minify

> The :env/fig:build/live build will write the generated javascript code in the `/docs/js/practicalli-landing-page.js` file.


## Running tests
TODO: add some tests
- check that the relevant sections are added
- check a section is returning the right form / structure


### Deploying to Test

Copy any changes in the following files and directories to the `/docs` directory:

- `resources/public/index.html`
- `resources/public/css`
- `resources/public/images`

Committing these files in the `/docs` directory will update [the test environment for this project](https://practicalli.github.io/practicalli.github.io/), allowing deployed changes to be viewed before pushing to live.


## Automated Deploy via GitHub Actions

`.github/workflows/deploy.yml` defines a GitHub Actions workflow to deploy on any commit to the `live` branch, including pull requests merged to that branch.

`clojure -M:env/figwheel:build/live` command is called to compile the ClojureScript code into an advanced compiled JavaScript file and written to the `docs` directory.

The GitHub Action deploys the contents of `docs` directory to the root of the `gh-pages` branch.  The GitHub repository pages section is configured to serve content from the root of the `gh-pages` branch, enforcing https.


## License

Copyright © 2019 Practicalli

Distributed under the Creative Commons Attribution Share-Alike 4.0 International
