(ns clojure-katas.teaparty
  (:use [midje.sweet]))

;; welcome should return the greeting with the proper title depending
;; on whether it is a man, woman, or knight
;; A woman is addressed as Ms.
;; A man is addressed as Mr.
;; A knight is addressed as Sir
;; The return string should be "Welcome (the title) (last name)

(defn welcome [last-name is-woman? is-sir?])

(future-fact (welcome "Austen" true false) => "Welcome Ms. Austen")
(future-fact (welcome "Orwell" false false) => "Welcome Mr. Orwell")
(future-fact (welcome "Newton" false true) => "Welcome Sir Newton")
