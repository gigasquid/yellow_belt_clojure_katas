(ns clojure-katas.teaparty
  (:use [midje.sweet]))

(defn welcome [last-name is-woman? is-sir?])

(future-fact "Welcome should return the greeting with the proper title
depending on whether it is a man, woman, or knight.
A woman is addressed as Ms.
A man is addressed as Mr.
A knight is addressed as Sir.
The return string should be Welcome (the title) (last name)"

             (welcome "Austen" true false) => "Welcome Ms. Austen"
             (welcome "Orwell" false false) => "Welcome Mr. Orwell"
             (welcome "Newton" false true) => "Welcome Sir Newton")
