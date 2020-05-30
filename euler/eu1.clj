; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
; Find the sum of all the multiples of 3 or 5 below 1000.

(ns eu1)

;(defn solve [n])
;(time (solve 1000))

(defn solve0 [upto] (apply + (filter #(zero? (min (mod % 3) (mod % 5))) (range upto))))

(defn solve1 [upto] (reduce + (set (concat (range 0 upto 3) (range 0 upto 5)))))

(println (time (solve0 1000)))
(println (time (solve1 1000)))
