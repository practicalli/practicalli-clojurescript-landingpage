;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Practicalli landing page - content
;;
;; Functions that represent content areas of the landing page
;;
;; Author(s): John Stevenson
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns practicalli.content)



(defn navigation
  [web-assets]
  [:nav {:class      "navbar is-fixed-top is-success"
         :role       "navigation"
         :aria-label "main navigation"}
   ;; Layout menu with margins to match all other content
   [:div {:class "container"}
    [:div {:class "navbar-brand"}
     [:a {:class "navbar-item"
          :href  "/"}
      [:img {:src (web-assets :logo)}]]
     [:span {:class       "navbar-burger burger"
             :data-target "navbarPracticalli"}
      ;; Empty spans needed for navbar burger
      [:span] [:span] [:span]]]
    [:div {:id    "navbarPracticalli"
           :class "navbar-menu"}
     [:div {:class "navbar-start"}

      [:a {:class "navbar-item"
           :href  "/blog/"} "Blog"]

      [:a {:class "navbar-item"
           :href  "#videos-broadcasts"} "Videos"]

      [:a {:class "navbar-item"
           :href  "#books"} "Books"]

      [:a {:class "navbar-item"
           :href  "#contact"} "Contact"]

      [:a {:class "navbar-item"
           :href  "#support"} "Support"]

      [:a {:class "navbar-item"
           :href  "#resources"} "Resources"]]

     [:div {:class "navbar-end"}

      [:a {:class "navbar-item has-text-weight-bold"
           :href  (web-assets :status)
           :target "_blank"} "Status"]

      [:span {:class "navbar-item"}
       [:a {:class  "button is-inverted"
            :target "_blank"
            :href   (web-assets :repository)}
        [:span {:class "icon"}
         [:i {:class "fab fa-github"}]]
        [:span "Issues/PRs"]]]]]]])




(defn title-banner
  "Top banner and navigation for the website"
  [web-assets]
  [:section {:class "section"}
   [:div {:class "container"}
    [:div {:class "columns is-vcentered"}

     [:div {:class "column is-2 is-offset-1"}
      [:img {:src   (-> web-assets :landing-page :logo)
             :width "160px"}]]

     [:div {:class "column"}
      [:h1 {:class "title is-1"}
       "Practicalli"]
      [:h3 {:class "subtitle"}
       "Practical approaches to learning Functional Programming with Clojure"]
      [:h4 {:class "subtitle"}
       "(-> idea :learn :design :document :code :test :deploy)"]
      [:div {:div "content"}
       "Getting started with Clojure programming via YouTube broadcasts, screencasts and books. Learn how to "
       [:a {:href "https://practicalli.github.io/clojure/clojure-cli/"}
        "use Clojure CLI tools"]
       " to create and develop Clojure projects.  Follow guides to install and get started with "
       [:a {:href "https://practicalli.github.io/clojure/clojure-editors/"}
        "Clojure aware editors"]
       "."]]]]])

(defn title-banner-covid
  "Top banner and navigation for the website during covid symptoms"
  []
  [:section {:class "section"}
   [:div {:class "container"}
    [:div {:class "columns is-vcentered"}

     [:div {:class "column is-2 is-offset-1"}
      [:img {:src   "images/practicalli-logo.png"
             :width "160px"}]]

     [:div {:class "column"}
      [:h1 {:class "title is-1"}
       "Practicalli"]
      [:h3 {:class "subtitle"}
       "Practical approaches to learning Functional Programming with Clojure"]
      [:div {:class "content"}
       "Getting started with Clojure programming via YouTube broadcasts, screencasts and books. Learn how to "
       [:a {:href "https://practicalli.github.io/clojure/clojure-tools/using-clojure-tools.html"}
        "use Clojure CLI tools"]
       " to create and develop Clojure projects.  Follow guides to install and get started with "
       [:a {:href "https://practicalli.github.io/clojure/clojure-editors/"}
        "Clojure aware editors"]
       "."]
      [:div {:class "content is-size-5 is-italic"}
       "Live broadcasts and content updates are on hold as the Practicalli team contracted Covid19 in January and is still suffering from the symptoms"
       ]]]]])


(defn sponsorship
  "Generate website section for a main sponsor
  Arguments:
  - hash-map of sponsor details
  Returns:
  - vector of hiccup to be rendered as a reagent component"
  [sponsor]
  [:div {:class "container"}
   [:div {:class "box"}

    [:div {:class "content"}
     [:a {:href   (-> sponsor :reports :repository)
          :target "_blank"}
      [:h2 {:class "title has-text-centered"}
       "Clojurists Together Sponsorship Journal"]]]

    [:div {:class "columns is-vcentered"}
     [:div {:class "column"}
      [:a {:href   (:url sponsor)
           :target "_blank"}
       [:figure {:class "image"}
        [:img {:src (:logo sponsor)}]]]]

     #_[:div {:class "column"}
      [:div {:class "content"}
       [:ul
        [:li [:a {:href   (-> sponsor :reports :year-2022 :q2 :update1)
                  :target "_blank"}
              "Update: May 01-15"]]
        [:li [:a {:href   (-> sponsor :reports :year-2022 :q2 :update2)
                  :target "_blank"}
              "Update: May 16-30"]]
        [:li [:a {:href   (-> sponsor :reports :year-2022 :q2 :update3)
                  :target "_blank"}
              "Update: June 01-15"]]
        [:li [:a {:href   (-> sponsor :reports :year-2022 :q2 :update4)
                  :target "_blank"}
              "Update: June 16-30"]]
        [:li [:a {:href   (-> sponsor :reports :year-2022 :q2 :update5)
                  :target "_blank"}
              "Update: July 01-15"]]
        [:li [:a {:href   (-> sponsor :reports :year-2022 :q2 :update6)
                  :target "_blank"}
              "Update: July 16-30"]]]
       ]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:ul
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q2 :update1)
                  :target "_blank"}
              "Update: May 01-15"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q2 :update2)
                  :target "_blank"}
              "Update: May 16-30"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q2 :update3)
                  :target "_blank"}
              "Update: June 01-15"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q2 :update4)
                  :target "_blank"}
              "Update: June 16-30"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q2 :update5)
                  :target "_blank"}
              "Update: July 01-15"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q2 :update6)
                  :target "_blank"}
              "Update: July 16-30"]]]
       ]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:ul
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q3 :update1)
                  :target "_blank"}
              "Update: August 16-31"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q3 :update2)
                  :target "_blank"}
              "Update: September 01-15"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q3 :update3)
                  :target "_blank"}
              "Update: September 16-30"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q3 :update4)
                  :target "_blank"}
              "Update: October 01-15"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q3 :update5)
                  :target "_blank"}
              "Update: October 15-31"]]
        [:li [:a {:href   (-> sponsor :reports :year-2020 :q3 :update6)
                  :target "_blank"}
              "Update: November 01-15"]]]
       ]]]]])



(defn youtube-playlists-list
  [youtube-links]
  [:div {:class "content"}
   [:h2 {:class "title has-text-centered"}
    "Practicalli Video Playlists"]
   [:ul {:style {:list-style-type "none"}}
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-study-group])
              :target "_blank"}
          [:span {:class "icon"}
           [:i {:class "fab fa-youtube"}]]
          "Clojure study group"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-cli-tools])
              :target "_blank"}
          [:span {:class "icon"}
           [:i {:class "fab fa-youtube"}]]
          "Clojure CLI tools and deps.edn"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-spacemacs])
              :target "_blank"}
          [:span {:class "icon"}
           [:i {:class "fab fa-youtube"}]]
          "Spacemacs - Emacs and Vim tools for (Clojure) development"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-4clojure-guides])
              :target "_blank"}
          [:span {:class "icon"}
           [:i {:class "fab fa-youtube"}]]
          "4Clojure Guides"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-spec])
              :target "_blank"}
          [:span {:class "icon"}
           [:i {:class "fab fa-youtube"}]]
          "Clojure Spec & Generative Testing"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-webapps])
              :target "_blank"}
          [:span {:class "icon"}
           [:i {:class "fab fa-youtube"}]]
          "Clojure Server-side WebApps & APIs"]]
    [:li [:a {:href   (get-in youtube-links [:playlists :practicalli-clojure-data-science])
              :target "_blank"}
          [:span {:class "icon"}
           [:i {:class "fab fa-youtube"}]]
          "Clojure Data Science and Visualization"]]
    ]
   ])



(defn videos-broadcasts
  [youtube-links]
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns is-vcentered"}

     [:div {:class "column"}
      [:a {:href   (-> youtube-links :channel :practicalli :url)
           :target "_blank"}
       [:h2 {:class "title is-2 has-text-centered"}
        "Live Broadcasts"]
       [:h6 {:class "title is-6 has-text-centered"}
        "Live coding broadcasts to learn together"]
       [:figure {:class "image"}
        [:img {:src (-> youtube-links :channel :practicalli :banner)}]]]]

     [:div {:class "column"}
      (youtube-playlists-list youtube-links)]]]])







(defn support-practicalli
  "Ways in which you can contact Practicalli"
  [support-channels]
  [:div {:class "container"}
   [:div {:class "box"}
    [:h2 {:class "title has-text-centered"}
     "Support Practicalli"]
    [:div {:class "columns"}

     [:div {:class "column"}
      [:a {:href   (-> support-channels :youtube-subscribe :url)
           :target "_blank"}
       [:figure {:class "image"}
        [:img {:src (-> support-channels :youtube-subscribe :logo)}]]]
      [:p {:class "has-text-centered"}
       "Subscribe and share free video tutorials"]]

     [:div {:class "column"}
      [:a {:href   (-> support-channels :github-sponsors :url)
           :target "_blank"}
       [:figure {:class "image"}
        [:img {:src (-> support-channels :github-sponsors :logo)}]]]

      [:p {:class "has-text-centered"}
       "Join the many sponsors via GitHub"]]

     [:div {:class "column"}
      [:a {:href   (-> support-channels :paypal-me :url)
           :target "_blank"}
       [:figure {:class "image"}
        [:img {:src (-> support-channels :paypal-me :logo)}]]]

      [:p {:class "has-text-centered"}
       "Direct Contributions in any currency"]]

     ]]])


(defn contact
  "Ways in which you can contact Practicalli"
  [contact-channels]
  [:div {:class "container"}
   [:div {:class "box"}
    [:h2 {:class "title has-text-centered"}
     "Contact and Feedback"]
    [:div {:class "columns"}

     [:div {:class "column"}
      [:a {:href   (get-in contact-channels [:zulip :practicalli :url])
           :target "_blank"}
       [:figure {:class "image"}
        [:img {:src (get-in contact-channels [:zulip :practicalli :logo])}]]]
      [:p {:class "has-text-centered"}
       "Contains searchable archive of Clojurians Slack discussions"]]

     [:div {:class "column"}
      [:a {:href   (get-in contact-channels [:slack :practicalli :url])
           :target "_blank"}
       [:figure {:class "image"}
        [:img {:src (get-in contact-channels [:slack :practicalli :logo])}]]]

      [:a {:href   "http://clojurians.net"
           :target "_blank"}
       [:p {:class "has-text-centered"}
        "Sign up for a free account to the Clojurians Slack community"]]]

     ]]]) ;; End of contact


(defn resources
  "Useful resources for learning and practicing Clojure"
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Discovering Clojure"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://clojuredocs.org/" :target "_blank"} "Clojure docs"]]
         [:td "docs for functions"]]
        [:tr
         [:th
          [:a {:href "https://clojure.org/" :target "_blank"} "Clojure.org"]]
         [:td "language and concepts"]]
        [:tr
         [:th
          [:a {:href "https://cljdoc.org/" :target "_blank"} "CljDocs"]]
         [:td "search library docs"]]
        [:tr
         [:th
          [:a {:href "https://borkdude.github.io/re-find.web/" :target "_blank"} "re-find"]]
         [:td "suggest Clojure function from args & return value"]]
        [:tr
         [:th
          [:a {:href "https://clojuredesign.club/" :target "_blank"} "Clojure Design Club"]]
         [:td "podcast discussing Clojure design"]]]]]


     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Practicing Clojure"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://4clojure.oxal.org/" :target "_blank"} "4Ever-Clojure"]]
         [:td "learn Clojure functions"]]
        [:tr
         [:th
          [:a {:href "https://exercism.io/tracks/clojure" :target "_blank"} "Exercism"]]
         [:td "code practice & mentorship"]]
        [:tr
         [:th
          [:a {:href "https://www.codingame.com/" :target "_blank"} "CodinGame"]]
         [:td "practice & learn the fun way"]]]]]

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Clojure ebooks"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://github.com/clojure-cookbook/clojure-cookbook"
               :target "_blank"} "Clojure Cookbook"]]]
        [:tr
         [:th
          [:a {:href "http://practical.li/clojure" :target "_blank"} "Practicalli Clojure"]]]
        [:tr
         [:th
          [:a {:href "http://practical.li/clojure-web-services" :target "_blank"} "Practicalli Clojure Web Services"]]]
        [:tr
         [:th
          [:a {:href "http://funcool.github.io/clojurescript-unraveled/" :target "_blank"} "ClojureScript Unraveled"]]]
        [:tr
         [:th
          [:a {:href "https://www.braveclojure.com/clojure-for-the-brave-and-true/" :target "_blank"} "Brave Clojure"]]]]]]

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Clojure Videos"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/watch?v=9A9qsaZZefw&list=PLAC43CFB134E85266" :target "_blank"} "Clojure Language Overview"]]
         [:td "describing language concepts"]]
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiDjyU7cQYWOEFBDR1t7t0wv" :target "_blank"} "Practising Clojure"]]
         [:td "100+ hours of Clojure coding"]]
        [:tr
         [:th
          [:a {:href "http://www.parens-of-the-dead.com/" :target "_blank"} "Parens of the dead"]]
         [:td "REPL driven development of a card game"]]
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/user/ClojureTV" :target "_blank"} "Clojure TV"]]
         [:td "conference talks"]]
        ]]]]]])



;; helper functions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn level-separator
  "A separator to provide a gap between components.
  The separator takes an id so that the section
  does not get hidden by the menu when linking"
  [identifier]
  [:div {:class "level"
         :id    identifier}
   [:h5 {:class "is-size-5 is-invisible"}
    identifier]])



;; Design Journal
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; Testing sponsorship function
#_
(sponsorship {:url     ""
              :logo    ""
              :reports {:update1 ""}})
