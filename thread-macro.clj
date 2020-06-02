
(ns tm)

(println (repeat 20 "a" ))

;(println ("))
;(println (-> (repeat)))

(println
  (reduce +
    (map #(* % 2)
      (filter even?
        [3 4 5 6]))))


(println (
  ->> [3 4 5 6]
  (filter even?)
  (map #(* % 2))
  (reduce +)))
