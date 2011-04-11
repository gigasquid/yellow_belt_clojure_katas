(ns clojure-katas.test.teleprompter
  (:use clojure-katas.teleprompter :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))

(def dict-1 {"hizzle" "house"})
(def dict-2 {"hizzle" "house"
              "brainspin" "insomnia"})

(deftest teleprompter-test
  (future-facts "about translate"
         (translate "In the hizzle" dict-1)
         => "In the house"
         (translate "In the hizzle, hizzle" dict-1)
         => "In the house, house"
         (translate "In the hizzle, suffering from brainspin" dict-2)
         => "In the house, suffering from insomnia"))
