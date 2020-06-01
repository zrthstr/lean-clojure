;The prime factors of 13195 are 5, 7, 13 and 29.
;
;What is the largest prime factor of the number 600851475143 ?

(load-file '"primes.clj")

(ns eu3)

; naiv prime factorial
(defn first_pfac [n]
  ())

; ( Math/sqrt 100 )
;(defn ppfac [n] )

(defn solve0 [maxi]
  (max (pfac maxi)))

;(println (time (solve0 600851475143)))

;(println (first_pfac 15))
