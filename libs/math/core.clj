(ns my.lib.of.math
  (:use [clojure.java.io :as io :only [reader]])
  (:gen-class :main true))

(load-file "./libs/math/gcd.clj")
(load-file "./libs/math/lcm.clj")
(load-file "./libs/math/prime.clj")
(load-file "./libs/math/abundant.clj")

; Iterate from 0 up to 'n'
; * test 'fn' validity in each iteration if true, call 'fn_out'
(defn all-up-to? [fn, fn_out, n]
  (loop [i 0]
    (if (fn i)
      (fn_out i))
    (when (< i n)
      (recur (+ i 1)))))
