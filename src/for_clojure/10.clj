;; tanwill's solution to Intro to Maps
;; https://4clojure.com/problem/10

Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.	

(= __ ((hash-map :a 10, :b 20, :c 30) :b))

(= __ (:b {:a 10, :b 20, :c 30}))

;; Solution

20