(ns clojure-katas.nasa-countdown
  (:use [midje.sweet]))

;; Countdown should return a list counting down from the start all the
;; way to zero

(defn countdown [start])

(future-fact (countdown 5) => '(5 4 3 2 1 0))
(future-fact (countdown 0) => '(0))
