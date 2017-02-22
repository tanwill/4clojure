;; tanwill's solution to Sequences: rest
;; https://4clojure.com/problem/13

The rest function will return all the items of a sequence except the first.

(= __ (rest [10 20 30 40]))

;; Solution

[20 30 40]

;; Just a note, running this in REPL gave me a slightly different answer... (20 30 40). Parenthesis, not brackets.