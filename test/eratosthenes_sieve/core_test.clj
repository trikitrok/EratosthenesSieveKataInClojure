(ns eratosthenes-sieve.core-test
  (:use midje.sweet)
  (:use [eratosthenes-sieve.core]))

(facts
  "about Eratosthenes sieve"
  (fact
    "it returns all the primes up to a given number"
    (primes-up-to 2) => [2]))