(ns practicalli.data)



;; Application State
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; define your app data so that it doesn't get over-written on reload

(def web-assets
  {:landing-page {:logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/logos/practicalli-logo.png"
                  :banner "https://raw.githubusercontent.com/practicalli/graphic-design/live/banners/practicalli-logo.png"
                  :website "https://practical.li"
                  :status "https://status.practical.li/"
                  :repository "https://github.com/practicalli/practicalli.github.io"}

   :youtube
   {:channel
    {:practicalli {:url "https://www.youtube.com/practicalli"
                   :banner "https://raw.githubusercontent.com/practicalli/graphic-design/live/practicalli-website-banner-logos.png"}
     :jr0cket "https://www.youtube.com/CommunityDeveloper"}

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
     "https://www.youtube.com/playlist?list=PLpr9V-R8ZxiBWGAuncfBRYhZtY5-Bp75s"}}

   :contact-channels
   {:slack   {:clojurians  "https://clojurians.slack.com/"
              :practicalli {:url  "https://clojurians.slack.com/messages/practicalli"
                            :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/buttons/practicalli-slack-channel-button.png"}
              :spacemacs   "https://clojurians.zulipchat.com/#narrow/stream/spacemacs"}
    :zulip   {:clojurians  "https://clojurians.zulipchat.com/"
              :practicalli {:url  "https://clojurians.zulipchat.com/#narrow/stream/practicalli"
                            :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/buttons/practicalli-zulip-channel-button.png"}
              :events      "https://clojurians.zulipchat.com/#narrow/stream/events"}}

   :support-channels
   {:youtube-subscribe       {:url  "https://www.youtube.com/channel/UCLsiVY-kWVH1EqgEtZiREJw?sub_confirmation=1"
                              :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/buttons/practicalli-youtube-channel-subscribe-button.png"}
    :github-sponsors         {:url  "https://github.com/sponsors/practicalli-john/"
                              :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/buttons/practicalli-github-sponsors-button.png"}
    :brompton-across-britain {:url  "https://brompton-across-britain.github.io/"
                              :logo "images/brompton-across-britain-bike.png"}
    :patreon                 {:url  "https://www.patreon.com/practicalli"
                              :logo "images/patreon-navy.png"}
    :paypal-me               {:url  "https://paypal.me/practicalli"
                              :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/buttons/practicalli-paypal-me-button.png"}
    :kickstarter             {:url  "/"
                              :logo "images/kickstarter-logo.jpeg"}
    :clojurists-together     {:url  "https://www.clojuriststogether.org/"
                              :logo "https://raw.githubusercontent.com/practicalli/graphic-design/live/banners/clojurists-together-banner.png"
                              :reports
                              {:repository "https://github.com/practicalli/clojurists-together-journal"
                               :year-2022 {}
                               :year-2020 {:q2 {:update1 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-May-01-15.md"
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
                                                :update6 "https://github.com/practicalli/clojurists-together-journal/blob/live/2020-November-01-15.md"}}}}}})
