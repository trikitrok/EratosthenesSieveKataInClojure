(ns eratosthenes-sieve.core)

(defn- integers-up-to [n]
  (range 2 (inc n)))

(defn- multiple-of? [n p]
  (and (zero? (mod n p)) (not= n p)))

(defn- sieve [numbers prime]
  (let [sieved (remove #(multiple-of? % prime) numbers)
        next-prime (first (drop-while #(<= % prime) sieved))]
    (if (nil? next-prime)
      sieved
      (recur sieved next-prime))))

(defn primes-up-to [n]
  (sieve (integers-up-to n) 2))