(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x] (if (< x 0) (* x -1) x))


(defn divides? [divisor n] (if (== (mod n divisor) 0) true false))


(defn fizzbuzz [n] (cond
                    (divides? 15 n) "gotcha!"
                    (divides? 3 n) "fizz"
                    (divides? 5 n) "buzz"
                    :else ""))


(defn teen? [age] (if (< 12 age 20) true false))


(defn not-teen? [age] (if (not (teen? age)) true false))


(defn generic-doublificate [x] (cond
                                (number? x) (* 2 x)
                                (empty? x) nil
                                (list? x) (* 2 (count x))
                                (vector? x)(* 2 (count x))
                                :else true))
(defn leap-year? [year] (cond
                         (zero? (mod year 400)) true
                         (zero? (mod year 100)) false
                         (zero? (mod year 4)) true
                         :else false))
; '_______'
