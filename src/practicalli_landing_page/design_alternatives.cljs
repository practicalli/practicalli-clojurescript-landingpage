(ns practicalli-landing-page.design-alternatives)



(defn youtube-playlists-unordered-list
  [youtube-links]
  [:div {:class "content"}
   [:h2 {:class "title"}
    "Practicalli Video Playlists"]
   [:ul
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-study-group])
              :target "_blank"}
          "Clojure study group"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-4clojure-guides])
              :target "_blank"}
          "4Clojure Guides"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-webapps])
              :target "_blank"}
          "Clojure Server-side WebApps & APIs"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-cli-tools])
              :target "_blank"}
          "Clojure CLI tools and deps.edn"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-data-science])
              :target "_blank"}
          "Clojure Data Science and Visualization"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-spacemacs])
              :target "_blank"}
          "Spacemacs - Emacs and Vim tools for (Clojure) development"]]]
   ]
  )



;; Search bar probably needs to be wired up to some JavaScript
;; Panel outer boarder not joining up with the panel heading
(defn youtube-playlists-panel
  [youtube-links]
  [:div {:class "content"}
   [:article {:class "panel is-danger"}
    #_[:p {:class "panel-heading"}
       "Practicalli YouTube playlists"]

    #_[:p {:class "panel-tabs"}
       ]

    #_[:div {:class "panel-block"}
       [:p {:class "control has-icons-left"}
        [:input {:class       "input is-primary"
                 :type        "text"
                 :placeholder "Search"}]
        [:span {:class "icon is-left"}
         [:i {:class       "fas fa-search"
              :aria-hidden "true"}]]]]

    [:a {:class  "panel-block is-active"
         :href   (get-in youtube-links [:playlists :practicalli-clojure-study-group])
         :target "_blank"}
     [:span {:class "panel-icon"}
      [:i {:class       "fab fa-youtube"
           :aria-hidden "true"}]]
     "Clojure Study group"]

    [:a {:class  "panel-block is-active"
         :href   (get-in youtube-links [:playlists :practicalli-4clojure-guides])
         :target "_blank"}
     [:span {:class "panel-icon"}
      [:i {:class       "fab fa-youtube"
           :aria-hidden "true"}]]
     "4Clojure Guides"]

    [:a {:class  "panel-block is-active"
         :href   (get-in youtube-links [:playlists :practicalli-clojure-webapps])
         :target "_blank"}
     [:span {:class "panel-icon"}
      [:i {:class       "fab fa-youtube"
           :aria-hidden "true"}]]
     "Clojure WebApps and APIs"]

    [:a {:class  "panel-block is-active"
         :href   (get-in youtube-links [:playlists :practicalli-clojure-cli-tools])
         :target "_blank"}
     [:span {:class "panel-icon"}
      [:i {:class       "fab fa-youtube"
           :aria-hidden "true"}]]
     "Clojure CLI tools and deps.edn"]

    [:a {:class  "panel-block is-active"
         :href   (get-in youtube-links [:playlists :practicalli-clojure-data-science])
         :target "_blank"}
     [:span {:class "panel-icon"}
      [:i {:class       "fab fa-youtube"
           :aria-hidden "true"}]]
     "Clojure Data Science and Visualization"]

    [:a {:class  "panel-block is-active"
         :href   (get-in youtube-links [:playlists :practicalli-spacemacs])
         :target "_blank"}
     [:span {:class "panel-icon"}
      [:i {:class       "fab fa-youtube"
           :aria-hidden "true"}]]
     "Spacemacs - Emacs and Vim tools for (Clojure) development"]

    ]]
  )



#_(defn books-explicit-definitions
  "Replaced by practicalli-landing-page.books book-list and generate-book-list functions"
  []
  [:div {:class "container"}

   ;; Books complete enough to use
   [:div {:class "box"}

    [:div {:class "columns"}
     [:div {:class "column"}
      [:h2 {:class "title has-text-centered"}
       "Freely available books online"]
      [:div {:class "columns"}

       [:div {:class "column"}
        [:a {:href   "https://practicalli.github.io/spacemacs/"
             :target "_blank"}
         [:figure {:class "image"}
          [:img {:src "images/practicalli-spacemacs-book-banner.png"}]]]
        [:p {:class "content has-text-centered"}
         "Powerful editing with Emacs and Vim multi-modal editing, with a mnemonic menu that simplifies the learning curve.  Install a full Clojure development experience with two Git commands."]
        [:p {:class "has-text-centered"}
         [:a {:href   "https://github.com/practicalli/spacemacs-content/commits/"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/commit-activity/y/practicalli/spacemacs-content?style=for-the-badge"
                 :alt "Monthly commits on GitHub"}]]
         [:a {:href   "https://github.com/practicalli/spacemacs-content/issues"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/issues/practicalli/spacemacs-content?style=for-the-badge&color=purple&label=content%20ideas"
                 :alt "Content ideas as GitHub issues"}]]
         [:a {:href   "https://github.com/practicalli/spacemacs-content/pulls"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/issues-pr/practicalli/spacemacs-content?style=for-the-badge&color=yellow&label=pull%20requests"
                 :alt "Content ideas as GitHub issues"}]]]]

       [:div {:class "column"}
        [:a {:href   "https://practicalli.github.io/clojure/"
             :target "_blank"}
         [:figure {:class "image"}
          [:img {:src "images/practicalli-clojure-book-banner.png"}]]]
        [:p {:class "has-text-centered"}
         "Learn the Clojure language through REPL driven development, using Clojure CLI tools and deps.edn"]
        [:p {:class "has-text-centered"}
         [:a {:href   "https://github.com/practicalli/clojure-practicalli-content/commits/"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/commit-activity/y/practicalli/clojure-practicalli-content?style=for-the-badge"
                 :alt "Monthly commits on GitHub"}]]
         [:a {:href   "https://github.com/practicalli/clojure-practicalli-content/issues"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/issues/practicalli/clojure-practicalli-content?style=for-the-badge&color=purple&label=content%20ideas"
                 :alt "Content ideas as GitHub issues"}]]
         [:a {:href   "https://github.com/practicalli/clojure-practicalli-content/pulls"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/issues-pr/practicalli/clojure-practicalli-content?style=for-the-badge&color=yellow&label=pull%20requests"
                 :alt "Content ideas as GitHub issues"}]]]]


       [:div {:class "column"}
        [:a {:href   "https://practicalli.github.io/clojure-webapps/"
             :target "_blank"}
         [:figure {:class "image"}
          [:img {:src "images/practicalli-clojure-webapps-book-banner.png"}]]]
        [:p {:class "has-text-centered"}
         "Build server-side apps, micro-services and functional API's in Clojure, covering a range of community libraries"]
        [:p {:class "has-text-centered"}
         [:a {:href   "https://github.com/practicalli/clojure-webapps-content/commits/"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/commit-activity/y/practicalli/clojure-webapps-content?style=for-the-badge"
                 :alt "Monthly commits on GitHub"}]]
         [:a {:href   "https://github.com/practicalli/clojure-webapps-content/issues"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/issues/practicalli/clojure-webapps-content?style=for-the-badge&color=purple&label=content%20ideas"
                 :alt "Content ideas as GitHub issues"}]]
         [:a {:href   "https://github.com/practicalli/clojure-webapps-content/pulls"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/issues-pr/practicalli/clojure-webapps-content?style=for-the-badge&color=yellow&label=pull%20requests"
                 :alt "Content ideas as GitHub issues"}]]]]
       ]]]]

   ;; Books under heavy development
   [:div {:class "box"}
    [:div {:class "column"}
     [:h2 {:class "title has-text-centered"}
      "Alpha stage books"]]


    ;; Practicalli ClojureScript
    [:div {:class "column"}
     [:div {:class "columns"}

      ;; Book banner logo
      [:div {:class "column"}
       [:a {:href   "https://practical.li/clojurescript/"
            :target "_blank"}
        [:figure {:class "image"}
         [:img {:src "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-clojurescript-book-banner-alpha.png"}]]]]

      ;; Book description
      [:div {:class "column"}

       [:p
        [:a {:href "https://practical.li/clojurescript/"
             :target "_blank"
             :class "has-text-weight-bold"}
         "Practicalli ClojureScript"]
        " - build single page apps (SPA's), dynamic UI's and mobile apps with responsive design. "]
       [:p
        "Figwheel-main provides instant feedback during development, pushing changes to the browser as they are saved " ]
       [:p
        "Reagent library is an interface to React, driving UI components (functions) with immutable Clojure data structures"]

       [:p {:class "has-text-centered"}
        [:a {:href   "https://github.com/practicalli/clojurescript-content/commits/"
             :target "_blank"}
         [:img {:src "https://img.shields.io/github/commit-activity/y/practicalli/clojurescript-content?style=for-the-badge"
                :alt "Monthly commits on GitHub"}]]
        [:a {:href   "https://github.com/practicalli/clojurescript-content/issues"
             :target "_blank"}
         [:img {:src "https://img.shields.io/github/issues/practicalli/clojurescript-content?style=for-the-badge&color=purple&label=content%20ideas"
                :alt "Content ideas as GitHub issues"}]]
        [:a {:href   "https://github.com/practicalli/clojurescript-content/pulls"
             :target "_blank"}
         [:img {:src "https://img.shields.io/github/issues-pr/practicalli/clojurescript-content?style=for-the-badge&color=yellow&label=pull%20requests"
                :alt "Content ideas as GitHub issues"}]]]]]]

    ;; Practicalli Data Science
    [:div {:class "column"}
     [:div {:class "columns"}

      ;; Book banner logo
      [:div {:class "column"}
       [:a {:href   "https://practical.li/data-science/"
            :target "_blank"}
        [:figure {:class "image"}
         [:img {:src "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-clojure-data-science-book-banner-alpha.png"}]]]]

      ;; Book description
      [:div {:class "column"}
       [:p
        [:a {:href   "https://practical.li/data-science/"
             :target "_blank"
             :class  "has-text-weight-bold"}
         "Practicalli Data Science with Clojure"]
        " - discover Clojure tools and techniques when working with data science related projects."]
       [:p "Ingest data from various sources into Clojure data structures.   "]
       [:p "Transform Clojure data structures using fast and efficient community libraries"]
       [:p "Visualise data to communicate meaning from data sets"]
       [:p {:class "has-text-centered"}
        [:a {:href   "https://github.com/practicalli/data-science-content/commits/"
             :target "_blank"}
         [:img {:src "https://img.shields.io/github/commit-activity/y/practicalli/data-science-content?style=for-the-badge"
                :alt "Monthly commits on GitHub"}]]
        [:a {:href   "https://github.com/practicalli/data-science-content/issues"
             :target "_blank"}
         [:img {:src "https://img.shields.io/github/issues/practicalli/data-science-content?style=for-the-badge&color=purple&label=content%20ideas"
                :alt "Content ideas as GitHub issues"}]]
        [:a {:href   "https://github.com/practicalli/data-science-content/pulls"
             :target "_blank"}
         [:img {:src "https://img.shields.io/github/issues-pr/practicalli/data-science-content?style=for-the-badge&color=yellow&label=pull%20requests"
                :alt "Content ideas as GitHub issues"}]]]]]


     ;; Practicalli Clojure Kafka
     [:div {:class "column"}
      [:div {:class "columns"}

       ;; Book banner logo
       [:div {:class "column"}
        [:a {:href   "https://practical.li/clojure-kafka/"
             :target "_blank"}
         [:figure {:class "image"}
          [:img {:src "https://raw.githubusercontent.com/practicalli/graphic-design/live/book-covers/practicalli-clojure-kafka-book-banner-alpha.png"}]]]]

       ;; Book description
       [:div {:class "column"}
        [:p
         [:a {:href "https://practical.li/clojure-kafka/"
              :target "_blank"
              :class  "has-text-weight-bold"}
          "Practicalli Clojure Kafka"]
         " - use Clojure with Apache Kafka to build immutable event stream services."]
        [:p
         "Define specifications to validate data consumed and produced to Kafka topics." ]
        [:p "Use Jackdaw library to control Kafka and write Kafka Stream applications"]
        [:p {:class "has-text-centered"}
         [:a {:href   "https://github.com/practicalli/clojure-kafka-content/commits/"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/commit-activity/y/practicalli/clojure-kafka-content?style=for-the-badge"
                 :alt "Monthly commits on GitHub"}]]
         [:a {:href   "https://github.com/practicalli/clojure-kafka-content/issues"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/issues/practicalli/clojure-kafka-content?style=for-the-badge&color=purple&label=content%20ideas"
                 :alt "Content ideas as GitHub issues"}]]
         [:a {:href   "https://github.com/practicalli/clojure-kafka-content/pulls"
              :target "_blank"}
          [:img {:src "https://img.shields.io/github/issues-pr/practicalli/clojure-kafka-content?style=for-the-badge&color=yellow&label=pull%20requests"
                 :alt "Content ideas as GitHub issues"}]]]
        ]]]]


    ]])
