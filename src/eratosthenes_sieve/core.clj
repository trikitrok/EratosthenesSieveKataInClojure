(ns eratosthenes-sieve.core)

(defn- integers-up-to [n]
  (range 2 (inc n)))

(defn- multiple-of? [n p]
  (and (zero? (mod n p)) (not= n p)))

(defn- next-prime [prime numbers]
  (first (drop-while #(<= % prime) numbers)))

(defn- remove-multiples [numbers prime]
  (remove #(multiple-of? % prime) numbers))

(defn- sieve [numbers p]
  (if-let [next-p (next-prime p numbers)]
    (recur (remove-multiples numbers next-p) next-p)
    numbers))

(defn primes-up-to [n]
  (sieve (integers-up-to n) 1))