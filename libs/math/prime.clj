(in-ns 'my.lib.of.math)

; find divisor
(defn find-divisor [n, test]
  (cond
    (> (* test test) n) n
    (= (mod n test) 0) test
    :else (recur n (+ test 1))))

; smallest divisor
(defn smallest-divisor [n]
  (find-divisor n 2))


(defn prime? [n]
  (= n (smallest-divisor n)))

(defn sexy-prime? [n]
  (and (prime? n) (prime? (- n 6))))

(defn prime-less-than? [n]
  (def m (- n 1))
  (if (prime? m)
    m
    (recur m)))

(defn sexy-primes? [n]
  (when (> n 10)
    (def m (- n 1))
    (when (sexy-prime? m)
      (printf "(%s,%s) " m (- m 6)))
    (recur m)))

