(ns ^:figwheel-hooks hello-world.app
  (:require
   [hello-world.dep :as dep]))

(defn ^:after-load on-reload []
  (js/alert (str "on-reload" (dep/foo))))
