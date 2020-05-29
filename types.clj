(ns types)

(println (type true))
(println (type 10))
(println (type 1.1))

(println (type "1234"))

(println (type [1 2 3]))
(println (type '(11 22 33)))
(println (type :a ))

(println (type Thread))
(println (type 'blabla))
(println (type clojure.lang.Symbol))

(println (coll? '(1 2 3)))
(println (coll? [1 2 3]))

(println (seq? '(1 2 3)))
(println (seq? [1 2 3]))


(println (= true true))
(println (= true false))
(println (not true))
