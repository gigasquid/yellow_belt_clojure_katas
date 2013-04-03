(ns clojure-katas.teleprompter
  (:use [midje.sweet]))

;; Given an input text string and a list of slang words and their
;; translations
;; return the cleansed input string of the slang words

(defn translate [input-string dictionary])

(def dict-1 {"hizzle" "house"})
(def dict-2 {"hizzle" "house"
             "brainspin" "insomnia"})

(future-facts "about translate"
 (translate "In the hizzle" dict-1) => "In the house"
 (translate "In the hizzle, hizzle" dict-1) => "In the house, house"
 (translate "In the hizzle, suffering from brainspin" dict-2)
    => "In the house, suffering from insomnia")
