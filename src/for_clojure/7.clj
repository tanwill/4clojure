;; tanwill's solution to Vectors: conj
;; https://4clojure.com/problem/7

When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.

(= __ (conj [1 2 3] 4))

(= __ (conj [1 2] 3 4))

;; Solution

[1 2 3 4]