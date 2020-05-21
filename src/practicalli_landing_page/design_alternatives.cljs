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
