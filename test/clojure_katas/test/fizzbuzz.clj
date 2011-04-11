(ns clojure-katas.test.fizzbuzz
  (:use [clojure-katas.fizzbuzz] :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest test-fizzbuzz
  (future-facts "about fizzbuzz"
        (answer 3) => "fizz"
        (answer 5) => "buzz"
        (answer 15) => "fizzbuzz"
        (answer 7) => 7
        (answer 7) =not=> "fizz"))
