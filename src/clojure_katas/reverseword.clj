(ns clojure-katas.reverseword
  (:use [midje.sweet]))

(defn reverse-word [word])

(future-fact "Reverse a given input word"
 (reverse-word "looc") => "cool")
