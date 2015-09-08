(ns eratosthenes-sieve.core)

(defn- integers-up-to [n]
  (range 2 (inc n)))

(defn- multiple-of? [n p]
  (and (zero? (mod n p)) (not= n p)))

(defn- sieve [numbers prime]
  (remove #(multiple-of? % prime) numbers))

(defn primes-up-to [n]
  (sieve (sieve(integers-up-to n) 2) 3))