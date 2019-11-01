#!/usr/bin/env clojure

(ns my.lib.of.math
  (:use [clojure.java.io :as io :only [reader]])
  (:gen-class :main true))

(load-file "./libs/math/core.clj")

(defn p-gcd [a, b]
  (println "Greatest common divisor:" a b "=" (gcd a b)))

(defn p-lcm [a, b]
  (println "Least common multiple:" a b "=" (gcd a b)))

(defn p-prime? [n]
  (println "Is" n "Prime?" (prime? n)))

(defn p-prime-less-than? [n]
  (println "Prime less than" n "=" (prime-less-than? n)))

(p-gcd 15 6)
(p-gcd 45 30)
(p-gcd 90 60)


(p-lcm 15 6)
(p-lcm 45 30)
(p-lcm 90 60)
(p-lcm 21 6)

(p-prime? 1)
(p-prime? 6)
(p-prime? 7)
(p-prime? 149)
(p-prime? 150)
(p-prime? 2287)

(p-prime-less-than? 8)
(p-prime-less-than? 152)
(p-prime-less-than? 2260)
(p-prime-less-than? 2290)
