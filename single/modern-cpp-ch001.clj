#!/usr/bin/env clojure

;; accumulate all numbers divisible
;; by both 3 and 5 up to a given number

; constants
(def var1 3)
(def var2 5)

; module is zero
(defn mod-is-zero [num div]
  (= (mod num div) 0))

; is divisible by our constants (modulo is zero)
(defn is-divisible [num, div1, div2]
  (if (and (mod-is-zero num div1)
           (mod-is-zero num div2))
    num
    0))

; accumulate
(defn do-sum [sum, num, div1 div2]
  (+ sum (is-divisible num div1 div2)))

; algorithm
(defn div-iter
  ([num, div1, div2] (div-iter 0 num div1 div2))
  ([sum, num, div1, div2]
   (if (= num 0)
     sum
     (recur (do-sum sum num div1 div2)
            (- num 1)
            div1 div2))))

(defn sum-div [num]
  (div-iter num var1 var2))

(doseq [arg *command-line-args*]
  (println (sum-div (read-string arg))))
