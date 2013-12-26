(defproject clojure-katas "2.0.0-SNAPSHOT"
  :description "Clojure Katas with: write"
  :profiles {:dev {:plugins [[lein-midje "3.0.1"]]
                   :dependencies [[midje "1.5.1"]]}}
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.clojure/math.numeric-tower "0.0.2"]])
