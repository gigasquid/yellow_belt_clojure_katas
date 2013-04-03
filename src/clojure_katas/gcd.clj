(ns clojure-katas.gcd
  (:use [midje.sweet])
  (:require [clojure.math.numeric-tower :as math]))

(defn gcd [a b])

(future-facts "Greatest Common divisor:
gcd(a,0) = a
gcd(b, a mod b)"
              (gcd 3 0) => 3
              (gcd 48 180) => 12
              (gcd 9 28) => 1)
