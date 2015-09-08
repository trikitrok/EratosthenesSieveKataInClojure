(ns eratosthenes-sieve.core-test
  (:use midje.sweet)
  (:use [eratosthenes-sieve.core]))

(facts
  "about Eratosthenes sieve"
  (fact
    "it returns all the primes up to a given number"
    (primes-up-to 100) => [2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97]))