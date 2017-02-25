;; tanwill's solution to Intro to Functions
;; https://4clojure.com/problem/14

Clojure has many different ways to create functions.

(= __ ((fn add-five [x] (+ x 5)) 3))

(= __ ((fn [x] (+ x 5)) 3))

(= __ (#(+ % 5) 3))

(= __ ((partial + 5) 3))

;; Solution

8
