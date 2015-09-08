(ns eratosthenes-sieve.core)

(defn primes-up-to [n]
  (range 2 (inc n)))