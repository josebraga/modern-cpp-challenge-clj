#!/usr/bin/env clojure

(ns my.lib.of.math
  (:use [clojure.java.io :as io :only [reader]])
  (:gen-class :main true))

(load-file "./libs/math/core.clj")

; AUXILIARY
(defn simple-print [f, a]
  (println a "->" (f a)))

(defn simple-print-2 [f, a, b]
  (println a b "->" (f a b)))

(defn p-sexy-primes? [n]
  (println n "->")
  (sexy-primes? n)
  (println))

(println "\n# 1.2 greatest common divisor?")
(simple-print-2 gcd 15 6)
(simple-print-2 gcd 45 30)
(simple-print-2 gcd 90 60)

(println "\n# 1.3 least common multiple?")
(simple-print-2 lcm 15 6)
(simple-print-2 lcm 45 30)
(simple-print-2 lcm 90 60)
(simple-print-2 lcm 21 6)

(println "\n# 1.4 is prime?")
(simple-print prime? 1)
(simple-print prime? 6)
(simple-print prime? 7)
(simple-print prime? 149)
(simple-print prime? 150)
(simple-print prime? 2287)

(println "\n# 1.4 prime less than?")
(simple-print prime-less-than? 8)
(simple-print prime-less-than? 152)
(simple-print prime-less-than? 2260)
(simple-print prime-less-than? 2290)

(println "\n# 1.5 sexy primes less than?")
(p-sexy-primes? 12)
(p-sexy-primes? 120)
(p-sexy-primes? 1200)

(println "\n# 1.6 Abundant numbers and sum up to")
(defn p-abundant? [n]
  (if (is-abundant? n)
    (println n "->" (get-sum-proper-divisors n))))

(defn up-to-abundant [n]
  (println "Abundant numbers up to" n)
  (all-up-to? is-abundant? p-abundant? n))

(up-to-abundant 5)
(up-to-abundant 15)
(up-to-abundant 50)
(up-to-abundant 100)

(println "\n# 1.7 Pairs of amicable numbers up to?")
;(get-amicable-numbers (Integer/parseInt (read-line)))
(get-amicable-numbers 1000)

(println "\n# 1.8 List of 3-digit armstrong numbers:")
(is-armstrong-3)


(println "\n# 1.9 Prime factors of a number:")
;(simple-print prime-factors? -12)
(simple-print prime-factors? 1)
(simple-print prime-factors? 2)
(simple-print prime-factors? 8)
(simple-print prime-factors? 12)
(simple-print prime-factors? 16)
(simple-print prime-factors? 25)
(simple-print prime-factors? 315)
(simple-print prime-factors? 400)

