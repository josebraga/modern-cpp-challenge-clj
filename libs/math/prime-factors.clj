(in-ns 'my.lib.of.math)

(defn print-div-by [i n]
  (cond
    (> i (Math/sqrt n)) (if (= i 1) [] [n])
    (zero? (mod n 2)) (cons 2 (print-div-by 2 (/ n 2)))
    (zero? (mod n i)) (cons i (print-div-by i (/ n i)))
    :else (recur (+ i (if (= i 2) 1 2)) n)))

(defn prime-factors? [n]
  (print-div-by 2 n))
