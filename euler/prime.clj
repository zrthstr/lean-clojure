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



(println (take 5 (gen-primes)))
(println (n-primes 10))
(println (to-primes 100))

(println (is-prime 13))
(println (is-prime 31))
(println (is-prime 44))
(println (is-prime 10))
