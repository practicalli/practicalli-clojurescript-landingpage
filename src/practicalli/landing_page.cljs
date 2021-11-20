;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Practicalli Website
;;
;; A ClojureScript single page app with reagent
;; Created with Leinigen figwheel-main template
;; https://practical.li/
;;
;; Author(s): John Stevenson
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(ns ^:figwheel-hooks practicalli.landing-page
  (:require
   [goog.dom :as gdom]
   [reagent.dom :as rdom]

   ;; Practicalli
   [practicalli.books   :as books]
   [practicalli.content :as content]
   [practicalli.data    :as data]))


;; simple debug statement for each build
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(println (js/Date.) "Reloading: src/practicalli_landing_page.cljs")


;; Website structure
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn main-page
  "The layout of components on the main page."
  []
  [:div
   [content/navigation (data/web-assets :landing-page)]

   [content/title-banner data/web-assets]
   #_[content/title-banner-covid]

   [content/level-separator "videos-broadcasts"]
   [content/videos-broadcasts (data/web-assets :youtube)]

   [content/level-separator "books"]
   [books/book-list books/practicalli-books]

   [content/level-separator "contact"]
   [content/contact (data/web-assets :contact-channels)]

   [content/level-separator "support"]
   [content/support-practicalli (data/web-assets :support-channels)]

   [content/sponsorship (-> data/web-assets :support-channels :clojurists-together)]

   [content/level-separator "resources"]
   [content/resources]])




;; System configuration code
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn get-app-element []
  (gdom/getElement "app"))

(defn mount [el]
  (rdom/render [main-page] el))

(defn mount-app-element []
  (when-let [el (get-app-element)]
    (mount el)))

;; conditionally start your application based on the presence of an "app" element
;; this is particularly helpful for testing this ns without launching the app
(mount-app-element)

;; specify reload hook with ^;after-load metadata
(defn ^:after-load on-reload []
  (mount-app-element)
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
