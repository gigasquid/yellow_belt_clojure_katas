(ns clojure-katas.nasa-countdown
  (:use [midje.sweet]))

(defn countdown [start])

(future-fact "Countdown should return a list counting down from the
start all the way to zero"

 (countdown 5) => '(5 4 3 2 1 0)
 (countdown 0) => '(0))
