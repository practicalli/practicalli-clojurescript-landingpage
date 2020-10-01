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
    [:div {:class "columns is-vcentered"}

     [:div {:class "column is-2 is-offset-1"}
      [:img {:src   "images/practicalli-logo.png"
             :width "160px"}]]

     [:div {:class "column"}
      [:h1 {:class "title is-1"}
       "Practicalli"]
      [:h3 {:class "subtitle"}
       "Practical approaches to learning Functional Programming with Clojure"]
      [:div {:div "content"}
       "YouTube broadcasts, screencasts, books and guides to support your journey into Clojure"]]
     ]]])



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
     [:a {:href   (:url sponsor)
          :target "_blank"}
      [:h2 {:class "title has-text-centered"}
       "Sponsored by Clojurists Together - May-November 2020"]]]

    [:div {:class "columns is-vcentered"}
     [:div {:class "column"}
      [:a {:href   (:url sponsor)
           :target "_blank"}
       [:figure {:class "image"}
        [:img {:src (:logo sponsor)}]]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:ul
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q2 :update1])
                  :target "_blank"}
              "Update: May 01-15"]]
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q2 :update2])
                  :target "_blank"}
              "Update: May 16-30"]]
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q2 :update3])
                  :target "_blank"}
              "Update: June 01-15"]]
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q2 :update4])
                  :target "_blank"}
              "Update: June 16-30"]]
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q2 :update5])
                  :target "_blank"}
              "Update: July 01-15"]]
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q2 :update6])
                  :target "_blank"}
              "Update: July 16-30"]]]
       ]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:ul
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q3 :update1])
                  :target "_blank"}
              "Update: August 16-31"]]
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q3 :update2])
                  :target "_blank"}
              "Update: September 01-15"]]
        [:li [:a {:href   (get-in sponsor [:reports :year-2020 :q3 :update3])
                  :target "_blank"}
              "Update: September 16-30"]]
        #_[:li [:a {:href   (get-in sponsor [:reports :year-2020 :q3 :update4])
                    :target "_blank"}
                "Update: June 16-30"]]
        #_[:li [:a {:href   (get-in sponsor [:reports :year-2020 :q3 :update5])
                    :target "_blank"}
                "Update: July 01-15"]]
        #_[:li [:a {:href   (get-in sponsor [:reports :year-2020 :q3 :update6])
                    :target "_blank"}
                "Update: July 16-30"]]]
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
      [:a {:href   (get-in youtube-links [:channel :practicalli])
           :target "_blank"}
       [:h2 {:class "title is-2 has-text-centered"}
        "Live Broadcasts"]
       [:h6 {:class "title is-6 has-text-centered"}
        "A new broadcast every weekend covering Clojure and ClojureScript development"]
       [:figure {:class "image"}
        [:img {:src "images/practicalli-banner-icons-full-horizontal.png"}]]]]

     [:div {:class "column"}
      (youtube-playlists-list youtube-links)
      ]]]])



(defn books
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
    [:div {:class "columns"}
     [:div {:class "column"}
      [:h2 {:class "title has-text-centered"}
       "Books under major re-development"]
      [:div {:class "columns"}

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
        [:a {:href   "https://practicalli.github.io/clojurescript/"
             :target "_blank"}
         [:figure {:class "image"}
          [:img {:src "images/practicalli-clojurescript-book-banner.png"}]]]
        [:p {:class "has-text-centered"}
         "Learn ClojureScript to build single page apps (SPA's), dynamic UI's and mobile apps. Using figwheel-main (and eventually shadow-cljs) along with reagent (and eventually re-frame)"]
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
                 :alt "Content ideas as GitHub issues"}]]]]
       ]]]]])



(defn support-practicalli
  "Ways in which you can support Practicalli"
  [support-channels]
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}

     [:div {:class "column"}
      [:h2 {:class "title has-text-centered"}
       "Support Practicalli"]
      [:h3 {:class "subtitle has-text-centered"}
       "Help me create more content for everyone.  Motivation and financial support are always welcome."]

      [:div {:class "columns is-vcentered"}

       ;; YouTube Subscription

       [:div {:class "column"}
        [:div {:class "card"}
         [:div {:class "card-image"}
          [:a {:href   "http://yt.vu/+practicalli"
               :target "_blank"}
           [:figure {:class "image is-square"}
            [:img {:src "images/youtube-subscribe-button.jpg"}]]]]
         [:div {:class "card-content"}
          "Free Subscription"]]]


       ;; Charity cycle ride

       ;; [:div {:class "column"}

       ;;  [:div {:class "card"}
       ;;   [:div {:class "card-image"}

       ;;    [:a {:href   (get-in support-channels [:brompton-across-britain :url])
       ;;         :target "_blank"}
       ;;     [:figure {:class "image is-square"}
       ;;      [:img {:src (get-in support-channels [:brompton-across-britain :logo])}]]]]
       ;;   [:div {:class "card-content"}
       ;;    "My 1000 mile UK charity ride" ]]]


       ;; Paypal.me

       [:div {:class "column"}

        [:div {:class "card"}
         [:div {:class "card-image"}
          [:a {:href   (get-in support-channels [:paypal-me :url])
               :target "_blank"}
           [:figure {:class "image is-square"}
            [:img {:src (get-in support-channels [:paypal-me :logo])}]]]
          ]
         [:div {:class "card-content"}
          "Donation in any currency" ]]]


       ;; GitHub sponsors

       [:div {:class "column"}

        [:div {:class "card"}
         [:div {:class "card-image"}
          [:a {:href   (get-in support-channels [:github-sponsors :url])
               :target "_blank"}
           [:figure {:class "image is-square"}
            [:img {:src (get-in support-channels [:github-sponsors :logo])}]]]]
         [:div {:class "card-content"}
          "GitHub Sponsor (US Dollars)" ]]]

       ;; Sponsorship channels not used yet

       #_[:div {:class "column"}
          [:a {:href   (get-in support-channels [:patreon :url])
               :target "_blank"}
           [:figure {:class "image"}
            [:img {:src (get-in support-channels [:patreon :logo])}]]]]

       #_[:div {:class "column"}
          [:h {:class "title is-4 has-text-centered"}
           "Specific campaigns coming soon!"]
          [:a {:href   (get-in support-channels [:kickstarter :url])
               :target "_blank"}
           [:figure {:class "image"}
            [:img {:src (get-in support-channels [:kickstarter :logo])}]]]]

       ]]]]])



(defn contact
  "Ways in which you can contact Practicalli"
  []
  [:div {:class "container"}
   [:div {:class "box"}
    [:div {:class "columns"}

     [:div {:class "column is-8 is-offset-2"}
      [:h2 {:class "title has-text-centered"}
       "Contact and Feedback"]

      [:a {:href   "https://clojurians.slack.com/messages/practicalli"
           :target "_blank"}
       [:figure {:class "image"}
        [:img {:src "images/practicalli-slack-channel.png"}]]]

      [:a {:href   "http://clojurians.net"
           :target "_blank"}
       [:p {:class "has-text-centered"}
        "Sign up for a free account to the Clojurians Slack community"]]]]]])


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



;; Design Journal
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


;; Testing sponsorship function
#_
(sponsorship {:url     ""
              :logo    ""
              :reports {:update1 ""}})
