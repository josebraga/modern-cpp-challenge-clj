#!/usr/bin/env clojure

(ns my.lib.of.math
  (:use [clojure.java.io :as io :only [reader]])
  (:gen-class :main true))

(load-file "./libs/math/core.clj")

(defn p-gcd [a, b]
  (println a b "->" (gcd a b)))

(defn p-lcm [a, b]
  (println a b "->" (gcd a b)))

(defn p-prime? [n]
  (println n "->" (prime? n)))

(defn p-prime-less-than? [n]
  (println n "->" (prime-less-than? n)))

(defn p-sexy-primes? [n]
  (println n "->")
  (sexy-primes? n)
  (println))

(println "\n# 1.2 greatest common divisor?")
(p-gcd 15 6)
(p-gcd 45 30)
(p-gcd 90 60)

(println "\n# 1.3 least common multiple?")
(p-lcm 15 6)
(p-lcm 45 30)
(p-lcm 90 60)
(p-lcm 21 6)

(println "\n# 1.4 is prime?")
(p-prime? 1)
(p-prime? 6)
(p-prime? 7)
(p-prime? 149)
(p-prime? 150)
(p-prime? 2287)

(println "\n# 1.4 prime less than?")
(p-prime-less-than? 8)
(p-prime-less-than? 152)
(p-prime-less-than? 2260)
(p-prime-less-than? 2290)

(println "\n# 1.5")
(p-sexy-primes? 12)
(p-sexy-primes? 120)
(p-sexy-primes? 1200)

(println "\n")
