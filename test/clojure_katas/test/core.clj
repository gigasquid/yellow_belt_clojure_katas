(ns clojure-katas.test.core
  (:use [clojure-katas.core] :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest test-fizzbuzz
  (facts "about fizzbuzz"
        (fizzbuzz 3) => "fizz"
        (fizzbuzz 5) => "buzz"
        (fizzbuzz 15) => "fizzbuzz"
        (fizzbuzz 7) => 7
        (fizzbuzz 7) =not=> "fizz"))
