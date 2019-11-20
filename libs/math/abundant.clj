(in-ns 'my.lib.of.math)

; get sum proper divisors
(defn get-sum-proper-divisors [n]
  (defn update-sum [accum, i, n]
    (if (= (mod n i) 0)
      (if (= (/ n i) i)
        (+ accum i)
        (+ accum i (/ n i)))
      accum))
  (loop [accum 0
         i (int (Math/floor (Math/sqrt n)))]
    (if (= i 0)
      (- accum n)
      (recur (update-sum accum i n) (- i 1)))))

; is abundant ? (i.e., sum proper divisors larger than number)
(defn is-abundant? [n] (> (get-sum-proper-divisors n) n))

(defn get-amicable-numbers [limit]
  (loop [number 1]
    (def sum1 (get-sum-proper-divisors number))
    (when (< sum1 limit)
      (def sum2 (get-sum-proper-divisors sum1))
      (if (and (= sum2 number) (not= sum1 number))
        (println sum1 "<>" number)))
    (when (< number limit)
      (recur (+ number 1)))))
