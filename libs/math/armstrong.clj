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

(defn digits [n]
  (->> n str (map (comp read-string str))))

(defn cube [n] (* n n n))

(defn is-armstrong? [n]
  (def dgs (digits n))
  (def m (+ (cube (first dgs)) (cube (second dgs)) (cube (nth dgs 2))))
  (= m n))

(defn is-armstrong-3 []
  (loop [num 100]
    (when (< num 1000)
      (if (is-armstrong? num)
        (println num))
      (recur (+ num 1)))))

