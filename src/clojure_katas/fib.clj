(ns clojure-katas.fib
  (:use [midje.sweet]))

(defn fib[n])

(future-facts "Calculate the fibonacci sequence
f(0) = 0, f(1) = 1
f(n) = f(n-1) + f(n-2)"
         (fib 0) => 0
         (fib 1) => 1
         (fib 3) => 2
         (fib 10) => 55)
