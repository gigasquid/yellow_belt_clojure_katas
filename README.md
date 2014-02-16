# Yellow Belt Clojure Katas

This is a template for beginner level Clojure Katas done with tests in
[midje](https://github.com/marick/Midje).  The katas were taken more
or less from the (now vanished) Coding Kata site
(http://codingkata.org/katas/).

Once you've mastered these simple kata, check out the [Pragmatic
Programmers
Kata](http://codekata.pragprog.com/2007/01/code_kata_backg.html).


## Setup instructions

* Download and install
  [leiningen](https://github.com/technomancy/leiningen).
* Clone the project and change to the project directory.
* Run <code>lein midje</code>.  You should see all the tests run with "WORK TO
  DO".
* Choose a kata.  The shell source code with instructions is in the
  <code>src/clojure_katas</code> directory.  The tests are in the same files.
* To enable tests for a kata replace <code>future-facts</code> with
  <code>facts</code> or <code>future-fact</code> with <code>fact</code>.
* Run <code>lein midje</code> again.  You should have failing tests now.
* Fix the the code and run the tests!

If you have any problem setting up the project, please let me know.


# Corrections

Being a beginner myself, there might be mistakes or something I
missed.  As always, feedback is welcome.


