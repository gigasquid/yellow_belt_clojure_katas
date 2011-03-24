(ns clojure-katas.core)

(defn fizzbuzz [n]
  (let [mod3? (= 0 (mod n 3))
        mod5? (= 0 (mod n 5))]
    (cond
     (and mod3? mod5?) "fizzbuzz"
     mod3? "fizz"
     mod5? "buzz"
     number? n)))

