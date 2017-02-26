;; tanwill's solution to Hello World
;; https://4clojure.com/problem/16

Write a function which returns a personalized greeting.

(= (__ "Dave") "Hello, Dave!")
(= (__ "Jenn") "Hello, Jenn!")
(= (__ "Rhea") "Hello, Rhea!")

;; Solution

#(str "Hello, " % "!")

;; Note: Anonymous functions start with "#". The value is passed in with "%"