(ns clojure-katas.test.fib
  (:use clojure-katas.fib :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest fibtest
  (future-facts "about the fib function"
         (fib 0) => 0
         (fib 1) => 1
         (fib 3) => 2
         (fib 10) => 55))
