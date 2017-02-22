;; tanwill's solution to Maps: conj
;; https://4clojure.com/problem/11

When operating on a map, the conj function returns a new map with one or more key-value pairs "added".

(= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

;; Solution

[:b 2]
