;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Practicalli landing page - content
;;
;; Functions that represent content areas of the landing page
;;
;; Author(s): John Stevenson
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns practicalli-landing-page.content)



(defn navigation-fixed
  []
  [:nav {:class      "navbar is-fixed-top is-success"
         :role       "navigation"
         :aria-label "main navigation"}
   [:div {:class "container"}
    [:div {:class "navbar-brand"}
     [:a {:class "navbar-item"
          :href  "/"}
      [:img {:src "images/practicalli-logo.png"}]]
     [:span {:class       "navbar-burger burger"
             :data-target "navbarPracticalli"}
      ;; Empty spans needed for navbar burger
      [:span][:span][:span]]]
    [:div {:id    "navbarPracticalli"
           :class "navbar-menu"}
     [:div {:class "navbar-start"}
      [:a {:class "navbar-item"
           :href  "#overview"} "Overview"]

      [:a {:class "navbar-item"
           :href  "#study-group"} "Study Group"]
      [:a {:class "navbar-item"
           :href  "#videos"} "Videos"]
      [:a {:class "navbar-item"
           :href  "#books"} "Books"]
      [:a {:class "navbar-item"
           :href  "#support"} "Support"]
      [:a {:class "navbar-item"
           :href  "#resources"} "Resources"]
      [:span {:class "navbar-item"}
       [:a {:class  "button is-inverted"
            :target "_blank"
            :href   "https://github.com/practicalli/practicalli-landing-page"}
        [:span {:class "icon"}
         [:i {:class "fab fa-github"}]]
        [:span "Issues/PRs"]]]]]]])



(defn title-banner
  "Top banner and navigation for the website"
  []
  [:section {:class "section"}
   [:div {:class "container"}
    [:div {:class "columns"}

     [:div {:class "column is-2 is-offset-2"}
      [:img {:src   "images/practicalli-logo.png"
             :width "160px"}]]

     [:div {:class "column"}
      [:h1 {:class "title"}
       "Practicalli"]
      [:h3 {:class "subtitle"}
       "Practical approaches to learning Functional Programming with Clojure"]
      [:div {:div "content"}
       "YouTube broadcasts, screencasts and online guides to support you in your journey into Clojure and development tools"]]
     ]]])





(defn study-group
  [youtube-links]
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image"}
       [:img {:src "images/practicalli-study-group.png"}]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Clojure Study Group "]
       [:p
        [:a {:href   (get-in youtube-links [:channels :practicalli] )
             :target "_blank"}
         "Live broadcasts"]
        " each weekend covering a specific aspect of Clojure or ClojureScript."]
       [:p
        [:a {:href (get-in youtube-links [:playlists :study-group-jr0cket] )}
         "Clojure study group playlist"]
        " contains recordings of all previous broadcasts"]]]]]])



(defn books
  []
  [:div {:class "container"}
   [:div {:class "box"}

    [:div {:class "columns"}
     [:div {:class "column"}
      [:h2 {:class "title has-text-centered"}
       "Free Books online - work in progress"]
      [:div {:class "columns"}
       [:div {:class "column"}
        [:a {:href "https://practicalli.github.io/clojure/"}
         [:figure {:class "image"}
          [:img {:src "images/practicalli-clojure-book-cover.png"}]]]
        [:p {:class "has-text-centered"}
         "Learn the Clojure language"]]

       [:div {:class "column"}
        [:a {:href "https://practicalli.github.io/clojure-webapps/"}
         [:figure {:class "image"}
          [:img {:src "images/practicalli-clojure-webapps-book-cover.png"}]]]
        [:p {:class "has-text-centered"}
         "Build Clojure webapps and API's"]]

       [:div {:class "column"}
        [:a {:href "https://practicalli.github.io/clojurescript/"}
         [:figure {:class "image"}
          [:img {:src "images/practicalli-clojurescript-book-cover.png"}]]]
        [:p {:class "has-text-centered"}
         "Learn ClojureScript for websites, dynamic UI's and mobile apps"]]

       [:div {:class "column"}
        [:a {:href "https://practicalli.github.io/spacemacs/"}]
        [:figure {:class "image"}
         [:img {:src "images/practicalli-spacemacs-book-cover.png"}]]
        [:p {:class "has-text-centered"}
         "Clojure development with Spacemacs"]]
       ]]]]]
  )

(defn support-practicalli
  "Ways in which you can support Practicalli"
  [support-channels]
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}

     [:div {:class "column"}
      [:h3 {:class "title has-text-centered"}
       "Ways to support further content from Practicalli"]

      [:div {:class "columns"}
       [:div {:class "column is-2 is-offset-2"}
        [:a {:href   (get-in support-channels [:paypal-me :url])
             :target "_blank"}
         [:figure {:class "image is-128x128"}
          [:img {:src (get-in support-channels [:paypal-me :logo])}]]]]

       [:div {:class "column is-2 is-offset-2"}
        [:a {:href   (get-in support-channels [:patreon :url])
             :target "_blank"}
         [:figure {:class "image is-128x128"}
          [:img {:src (get-in support-channels [:patreon :logo])}]]]]

       [:div {:class "column is-2 is-offset-2"}
        [:a {:href   "http://yt.vu/+practicalli"
             :target "_blank"}
         [:figure {:class "image is-128x128"}
          [:img {:src "images/youtube-subscribe-button.jpg"}]]]]
       ]]]]])


(defn resources
  "Useful resources during the workshop.

  Where to go next after the workshop."
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Resources"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://clojuredocs.org/"} "Clojure docs"]]
         [:td "docs for functions"]]
        [:tr
         [:th
          [:a {:href "https://clojure.org/"} "Clojure.org"]]
         [:td "language and concepts"]]
        [:tr
         [:th
          [:a {:href "https://clojure.org/"} "CljDocs"]]
         [:td "search library docs"]]]]]

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Practising"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "http://www.4clojure.com/"} "4Clojure"]]
         [:td "learn Clojure functions"]]
        [:tr
         [:th
          [:a {:href "https://exercism.io/tracks/clojure"} "Exercism"]
          ]
         [:td "code practice & mentorship"]]
        [:tr
         [:th
          [:a {:href "https://www.codewars.com/?language=clojure"} "Code Wars"]]
         [:td "real coding challenges"]]
        [:tr
         [:th
          [:a {:href "https://www.codingame.com/"} "CodinGame"]]
         [:td "practice & learn the fun way"]]]]]

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Online books"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://github.com/clojure-cookbook/clojure-cookbook"} "Clojure Cookbook"]]]
        [:tr
         [:th
          [:a {:href "http://practicalli.github.io/"} "Practicalli Clojure"]]]
        [:tr
         [:th
          [:a {:href "http://funcool.github.io/clojurescript-unraveled/"} "ClojureScript Unraveled"]]]
        [:tr
         [:th
          [:a {:href "https://www.braveclojure.com/clojure-for-the-brave-and-true/"} "Brave Clojure"]]]]]]

     [:div {:class "column"}
      [:h4 {:class "title is-4"} "Videos"]
      [:table {:class "table"}
       [:tbody
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/user/ClojureTV"} "Clojure TV"]]
         [:td "conference talks"]]
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/watch?v=9A9qsaZZefw&list=PLAC43CFB134E85266"} "Clojure Language"]]
         [:td "describing language concepts"]]
        [:tr
         [:th
          [:a {:href "https://www.youtube.com/watch?v=MZcuL4lRw5E&list=PLy9I_IfUBzKJSgctCJaRYcnF6kZdiZ5ku"} "Practicalli study group"]]
         [:td "weekly practical lessons"]]
        [:tr
         [:th
          [:a {:href "http://www.parens-of-the-dead.com/"} "Parens of the dead"]]
         [:td "a card game in Clojure"]]]]]]]])



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
