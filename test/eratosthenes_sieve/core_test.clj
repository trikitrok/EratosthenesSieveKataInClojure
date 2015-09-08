(ns eratosthenes-sieve.core-test
  (:use midje.sweet)
  (:use [eratosthenes-sieve.core]))

(facts
  "about Eratosthenes sieve"
  (fact
    "it returns all the primes up to a given number"
    (primes-up-to 2) => [2]
    (primes-up-to 3) => [2 3]
    (primes-up-to 5) => [2 3 5]
    (primes-up-to 11) => [2 3 5 7 11]))