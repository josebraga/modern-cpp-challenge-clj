(in-ns 'my.lib.of.math)

; greatest common divisor
(defn gcd [a, b]
  (if (= b 0)
    a
    (recur b (mod a b))))
