(ns clojure-katas.test.gcd
  (:use clojure-katas.gcd :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest gcd-test
  (future-facts "about gcd"
         (gcd 3 0) => 3
         (gcd 48 180) => 12
         (gcd 9 28) => 1))
