(ns eratosthenes-sieve.core)

(defn- integers-up-to [n]
  (range 2 (inc n)))

(defn- multiple-of? [n p]
  (and (zero? (mod n p)) (not= n p)))

(defn- next-prime [prime numbers]
  (first (drop-while #(<= % prime) numbers)))

(defn- sieve [numbers prime]
  (remove #(multiple-of? % prime) numbers))

(defn primes-up-to [n]
  (loop [numbers (integers-up-to n) prime 1]
    (if-let [next-prime (next-prime prime numbers)]
      (recur (sieve numbers next-prime) next-prime)
      numbers)))