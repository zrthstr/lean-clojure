
( ns prime-test )

(load-file '"primes.clj")

(println (take 5 (primes/gen-primes)))
(println (primes/n-primes 10))
(println (primes/to-primes 100))

(println (primes/is-prime 13))
(println (primes/is-prime 31))
(println (primes/is-prime 44))
(println (primes/is-prime 10))

(println (primes/prime-factors-of 31))
(println (primes/prime-factors-of 1000))
(println (primes/prime-factors-of 1001))
