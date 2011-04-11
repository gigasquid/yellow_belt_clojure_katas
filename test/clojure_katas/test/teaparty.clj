(ns clojure-katas.test.teaparty
  (:use [clojure-katas.teaparty] :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest tea-party-test
  (future-fact (welcome "Austen" true false) => "Welcome Ms. Austen")
  (future-fact (welcome "Orwell" false false) => "Welcome Mr. Orwell")
  (future-fact (welcome "Newton" false true) => "Welcome Sir Newton"))

