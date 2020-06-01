(ns primes)

; things we will need for euler

; is_prime

; primes_to


(defn gen-primes "Generates an infinite, lazy sequence of prime numbers"
  []
  (letfn [(reinsert [table x prime]
             (update-in table [(+ prime x)] conj prime))
          (primes-step [table d]
             (if-let [factors (get table d)]
               (recur (reduce #(reinsert %1 d %2) (dissoc table d) factors)
                      (inc d))
               (lazy-seq (cons d (primes-step (assoc table (* d d) (list d))
                                              (inc d))))))]
    (primes-step {} 2)))

(defn n-primes "Generate n primes" [n]
           (take n (gen-primes)))

(defn to-primes "tbd" [maxi]
  ( take-while (partial > maxi) (gen-primes) ))

; most naive solution
(defn is-prime [n]  ; not working !!
  ;( take-while (partial > (Math/sqrt n)) (gen-primes)))
  ;(contains? ( take-while (partial > n) (gen-primes)) n ))
  (.contains ( to-primes n ) n ))


;(defn factors "get all prime factors of n" [n]
;  ( filter #(= 0(mod % n)) (take-while (partial > maxi) (  )) ))
(defn prime-factors-of
  ([n] (prime-factors-of 2 n))
  ([f n]
    (if (> n 1)
      (if (= 0 (mod n f))
        (cons f (prime-factors-of f (/ n f)))
        (recur (inc f) n))
      [])))

;(println (prime-factors-of 1000))

;(println (take 5 (gen-primes)))
;(println (n-primes 10))
;(println (to-primes 100))

;(println (is-prime 13))
;(println (is-prime 31))
;(println (is-prime 44))
;(println (is-prime 10))
