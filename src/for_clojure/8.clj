;; tanwill's solution to Intro to Sets
;; https://4clojure.com/problem/8

Sets are collections of unique values.

(= __ (set '(:a :a :b :c :c :c :c :d :d)))

(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; Solution

#{:a :b :c :d}