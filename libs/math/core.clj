(ns my.lib.of.math
  (:use [clojure.java.io :as io :only [reader]])
  (:gen-class :main true))

(load-file "./libs/math/gcd.clj")
(load-file "./libs/math/lcm.clj")
