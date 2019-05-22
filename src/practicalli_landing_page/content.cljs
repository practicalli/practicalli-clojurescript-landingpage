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

