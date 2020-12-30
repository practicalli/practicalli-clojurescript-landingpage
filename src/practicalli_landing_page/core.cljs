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

;; simple debug statement for each build
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(println (js/Date.) "Reloading: src/practicalli_landing_page/core.cljs")


;; Application State
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; define your app data so that it doesn't get over-written on reload
(defonce app-state
  (atom {:youtube

         {:channel
          {:practicalli
           "http://youtube.com/c/+practicalli"
           :jr0cket
           "http://yt.vu/+jr0cket"}

          :playlists
          {:jr0cket-study-group
           "https://www.youtube.com/watch?v=MZcuL4lRw5E&list=PLy9I_IfUBzKJSgctCJaRYcnF6kZdiZ5ku"
           :practicalli-clojure-study-group
           "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiDjyU7cQYWOEFBDR1t7t0wv"
           :practicalli-clojure-data-science
           "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiDUXIR2z8Y8wvhpoPyl0t_D"
           :practicalli-4clojure-guides
           "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiDB_KGrbliCsCUrmcBvdW16"
           :practicalli-clojure-webapps
           "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiCe9p9tFk24ChNSpGfanUbT"
           :practicalli-spacemacs
           "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiCHMl2_dn1Fovcd34Oz45su"
           :practicalli-clojure-cli-tools
           "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiB3u90ga_SdxYsF2k2JTag1"
           :practicalli-clojure-spec
           "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiBWGAuncfBRYhZtY5-Bp75s"
           }}

         :contact-channels
         {:slack   {:clojurians  "https://clojurians.slack.com/"
                    :practicalli {:url "https://clojurians.slack.com/messages/practicalli"
                                  :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/practicalli-slack-channel.png"}
                    :spacemacs   "https://clojurians.zulipchat.com/#narrow/stream/spacemacs"}
          :zulip   {:clojurians  "https://clojurians.zulipchat.com/"
                    :practicalli {:url "https://clojurians.zulipchat.com/#narrow/stream/practicalli"
                                  :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/practicalli-zulip-channel.png"}
                    :events      "https://clojurians.zulipchat.com/#narrow/stream/events"}
          :discord {:apropos     ""
                    :conjure     ""
                    :practicalli {:register "https://discord.gg/G2JKpw4"
                                  :url      ""
                                  :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/practicalli-discord-channel.png"}}}

         :support-channels
         {:brompton-across-britain {:url  "https://brompton-across-britain.github.io/"
                                    :logo "images/brompton-across-britain-bike.png"}
          :github-sponsors         {:url  "https://github.com/sponsors/jr0cket"
                                    :logo "images/github-sponsors-mona.png"}
          :patreon                 {:url  "https://www.patreon.com/practicalli"
                                    :logo "images/patreon-navy.png"}
          :paypal-me               {:url  "https://paypal.me/practicalli"
                                    :logo "images/paypal-me-logo.png"}
          :kickstarter             {:url  "/"
                                    :logo "images/kickstarter-logo.jpeg"}
          :clojurists-together     {:url  "https://www.clojuriststogether.org/"
                                    :logo "images/clojurists-together-banner.png"
                                    :reports
                                    {:year-2020 {:q2 {:update1 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-May-01-15.md"
                                                      :update2 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-May-16-31.md"
                                                      :update3 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-June-01-15.md"
                                                      :update4 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-June-16-30.md"
                                                      :update5 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-July-01-15.md"
                                                      :update6 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-July-16-31.md"}
                                                 :q3 {:update1 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-August-16-31.md"
                                                      :update2 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-September-01-15.md"
                                                      :update3 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-September-16-30.md"
                                                      :update4 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-October-01-15.md"
                                                      :update5 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-October-16-31.md"
                                                      :update6 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-November-01-15.md"}}} }}}))


;; Website structure
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn main-page
  "The layout of components on the main page."
  []
  [:div
   [content/navigation-fixed]

   [content/title-banner]

   [content/level-separator "videos-broadcasts"]
   [content/videos-broadcasts (get @app-state :youtube)]

   [content/level-separator "books"]
   [content/books]

   [content/level-separator "contact"]
   [content/contact (get @app-state :contact-channels)]

   [content/level-separator "support"]
   [content/support-practicalli (get @app-state :support-channels)]

   [content/sponsorship (get-in @app-state [:support-channels :clojurists-together])]

   [content/level-separator "resources"]
   [content/resources]
   ])



;; System configuration code
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn get-app-element []
  (gdom/getElement "app"))


(defn mount [el]
  (reagent/render-component [main-page] el))


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


;; REPL Driven Development
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

#_(reset! app-state
          {:text "Hello world!"
           :youtube
           {:channels
            {:practicalli
             "https://www.youtube.com/c/+practicalli"
             :jr0cket
             "http://yt.vu/+jr0cket"}
            :playlists
            {:jr0cket-study-group
             "https://www.youtube.com/watch?v=MZcuL4lRw5E&list=PLy9I_IfUBzKJSgctCJaRYcnF6kZdiZ5ku"}}})
