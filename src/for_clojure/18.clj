;; tanwill's solution to filter
;; https://4clojure.com/problem/18

The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true.

(= __ (filter #(> % 5) '(3 4 5 6 7)))

;; Solution

'(6 7)