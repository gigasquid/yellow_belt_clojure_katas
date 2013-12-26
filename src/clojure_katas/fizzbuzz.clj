(ns clojure-katas.fizzbuzz
  (:use [midje.sweet]))

(defn fizzbuzz [n])

(future-facts "Fizzbuzz returns \"fizz\" when the number is divisible
by 3, and \"buzz\" when the number is divisible by 5.  If divisible by
3 AND 5, return \"fizzbuzz\".  Otherwise, return the number."

              (fizzbuzz 3) => "fizz"
              (fizzbuzz 5) => "buzz"
              (fizzbuzz 15) => "fizzbuzz"
              (fizzbuzz 7) => 7
              (fizzbuzz 7) =not=> "fizz")
