(ns practicalli-landing-page.books)

(def practicalli-books
  [{:title       "Practicalli Spacemacs"
    :url         "https://practical.li/spacemacs"
    :image       "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-spacemacs-book-banner.png"
    :github-repo "spacemacs-content"
    :description " - powerful editing with Emacs and Vim multi-modal editing, with a mnemonic menu that simplifies the learning curve.  Install a full Clojure development experience with two Git commands."}

   {:title       "Practicalli Clojure"
    :url         "https://practical.li/clojure"
    :image       "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-clojure-book-banner.png"
    :github-repo "clojure-content"
    :description " - learn the Clojure language through REPL driven development using Clojure CLI tools (deps.edn). Use a rich set of community tools, including Rebel readline Terminal UI, Portal and Reveal data browsers and tools to manage all aspects of Clojure projects. Practice Clojure by solving challenges with examples of different approaches.  Encode the design and avoid regressions by writing unit tests and specifications for generative testing."}

   {:title       "Clojure Web"
    :url         "https://practical.li/clojure-webapps"
    :image       "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-clojure-webapps-book-banner.png"
    :github-repo "clojure-webapps-content"
    :description " - build server-side apps, micro-services and API's in Clojure.  Using Ring as an abstraction over HTTP with requests and responses as simple Clojure hash-maps. Routing of requests are managed by Compojure or Reitit, passing requests to handers which are Clojure functions. Data formats are managed by coercion and content negotiation. OpenAPI (swagger) is used for self-documenting APIs"}

   {:title       "Practicalli ClojureScript"
    :url         "https://practical.li/clojurescript"
    :image       "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-clojurescript-book-banner-alpha.png"
    :github-repo "clojurescript-content"
    :description " - build single page apps (SPA's), dynamic UI's and mobile apps with responsive design. Figwheel-main provides instant feedback during development, pushing changes to the browser as they are saved. Reagent library is an interface to React, driving UI components (functions) with immutable Clojure data structures."}

   {:title       "Practicalli Data Science"
    :url         "https://practical.li/data-science"
    :image       "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-clojure-data-science-book-banner-alpha.png"
    :github-repo "data-science-content"
    :description " - discover Clojure tools and techniques when working with data science related projects. Ingest data from various sources into Clojure data structures. Transform Clojure data structures using fast and efficient community libraries. Visualise data to communicate meaning from data sets"}

   {:title       "Practicalli Clojure with Kafka"
    :url         "https://practical.li/clojure-kafka"
    :image       "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-clojure-kafka-book-banner-alpha.png"
    :github-repo "clojure-kafka-content"
    :description " - use Clojure with Apache Kafka to build immutable event stream services. Define specifications to validate data consumed and produced to Kafka topics. Use Jackdaw library to control Kafka and write Kafka Stream applications"}

   #_{:title       ""
      :url         ""
      :image       ""
      :github-repo ""
      :description ""}])


(defn generator-book-list
  [books]
  (for [{:keys [title description url image github-repo]} books]

    [:div {:class "column"}
     [:div {:class "box"}
      [:div {:class "columns"}

       ;; Book banner logo
       [:div {:class "column"}
        [:a {:href url :target "_blank"}
         [:figure {:class "image"}
          [:img {:src image}]]]]

       ;; Book description
       [:div {:class "column"}

        [:p [:a {:href url :target "_blank" :class "has-text-weight-bold"}
             title]
         description]

        [:p {:class "has-text-centered"}
         [:a {:href   (str "https://github.com/practicalli/" github-repo "/commits")
              :target "_blank"}
          [:img {:src
                 (str "https://img.shields.io/github/commit-activity/y/practicalli/" github-repo "?style=for-the-badge")
                 :alt "Monthly commits on GitHub"}]]
         [:a {:href   (str "https://github.com/practicalli/" github-repo "/issues")
              :target "_blank"}
          [:img {:src (str "https://img.shields.io/github/issues/practicalli/" github-repo "?style=for-the-badge&color=purple&label=content%20ideas")
                 :alt "Content ideas as GitHub issues"}]]
         [:a {:href   (str "https://github.com/practicalli/" github-repo "/pulls")
              :target "_blank"}
          [:img {:src
                 (str "https://img.shields.io/github/issues-pr/practicalli/" github-repo "?style=for-the-badge&color=yellow&label=pull%20requests")
                 :alt "Content ideas as GitHub issues"}]]]]]]]))


(defn book-list
  [books]
  [:div {:class "container"}
   [:div {:class "box"}

    ;; Section Title
    [:div {:class "column"}
     [:h2 {:class "title has-text-centered"}
      "Freely available online books"]]
    (generator-book-list books)]])
