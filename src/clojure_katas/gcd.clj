(ns clojure-katas.gcd
  (:use [midje.sweet])
  (:require [clojure.math.numeric-tower :as math]))

;; Greatest Common divisor
;; gcd(a,0) = a
;; gcd(b, a mod b)

(defn gcd [a b])

(future-facts "about gcd"
              (gcd 3 0) => 3
              (gcd 48 180) => 12
              (gcd 9 28) => 1)
