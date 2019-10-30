(in-ns 'my.lib.of.math)

; least common multiple
(defn lcm [a, b]
  (/ (* a b) (gcd a b)))
