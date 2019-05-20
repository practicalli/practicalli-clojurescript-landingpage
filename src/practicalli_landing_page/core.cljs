;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Practicalli Website
;;
;; A ClojureScript single page app with reagent
;; Created with Leinigen figwheel-main template
;; https://practicalli.github.io
;;
;; Author(s): John Stevenson
;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(ns ^:figwheel-hooks practicalli-landing-page.core
  (:require
   [goog.dom :as gdom]
   [reagent.core :as reagent :refer [atom]]
   [practicalli-landing-page.content :as content]))


(println (js/Date.) "Reloading: src/practicalli_landing_page/core.cljs")


;; Application State
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "Hello world!"}))


;; Website structure
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn main-page
  []
  [:div
   [content/navigation-fixed]

   [content/title-banner]

   ])



;; System configuration code
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn mount [el]
  (reagent/render-component [main-page] el))

(defn get-app-element []
  (gdom/getElement "app"))

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
