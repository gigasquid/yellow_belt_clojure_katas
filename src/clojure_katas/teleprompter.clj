(ns clojure-katas.teleprompter
  (:use [midje.sweet]))

(defn translate [input-string dictionary])

(def dict-1 {"hizzle" "house"})
(def dict-2 {"hizzle" "house"
             "brainspin" "insomnia"})

(future-facts "Given an input text string and a list of slang words
and their translations, return a string cleansed of the slang words,
by replacing them with their translations."

 (translate "In the hizzle" dict-1) => "In the house"
 (translate "In the hizzle, hizzle" dict-1) => "In the house, house"
 (translate "In the hizzle, suffering from brainspin" dict-2)
    => "In the house, suffering from insomnia")
