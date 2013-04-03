(ns clojure-katas.reverseword
  (:use [midje.sweet]))

;; Reverse a given input word

(defn reverse-word [word])

(future-fact (reverse-word "looc") => "cool")
