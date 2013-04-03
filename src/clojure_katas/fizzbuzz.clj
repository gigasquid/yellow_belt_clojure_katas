(ns clojure-katas.fizzbuzz
  (:use [midje.sweet]))

;; answer should return "fizz" for n divisible by 3,
;; "buzz" for n divisible by 5
;; and "fizzbuzz" for n divisible by 5 and 3
;; otherwise just the number

(defn answer [n])

(future-facts "about fizzbuzz"
              (answer 3) => "fizz"
              (answer 5) => "buzz"
              (answer 15) => "fizzbuzz"
              (answer 7) => 7
              (answer 7) =not=> "fizz")
