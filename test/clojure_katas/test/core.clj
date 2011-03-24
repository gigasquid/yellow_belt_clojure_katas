(ns clojure-katas.test.core
  (:use [clojure-katas.core] :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest test-fizzbuzz
  (facts "about fizzbuzz"
        (answer 3) => "fizz"
        (answer 5) => "buzz"
        (answer 15) => "fizzbuzz"
        (answer 7) => 7
        (answer 7) =not=> "fizz"))
