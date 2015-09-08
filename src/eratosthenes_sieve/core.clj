(ns eratosthenes-sieve.core)

(defn- integers-up-to [n]
  (range 2 (inc n)))

(defn- multiple-of? [n p]
  (and (zero? (mod n p)) (not= n p)))

(defn primes-up-to [n]
  (remove #(multiple-of? % 2) (integers-up-to n)))