(ns eratosthenes-sieve.core)

(defn- integers-up-to [n]
  (range 2 (inc n)))

(defn- multiple-of? [n p]
  (and (zero? (mod n p)) (not= n p)))

(defn- next-prime [prime numbers]
  (first (drop-while #(<= % prime) numbers)))

(defn- sieve-multiples-of [prime numbers]
  (remove #(multiple-of? % prime) numbers))

(defn- sieve [numbers]
  (loop [primes numbers prime 2]
    (let [sieved (sieve-multiples-of prime primes)]
      (if-let [prime (next-prime prime sieved)]
        (recur sieved prime)
        primes))))

(defn primes-up-to [n]
  (sieve (integers-up-to n)))
