(ns syn )

; this is a comment

(println  ( + 1 2))          ; => 3
(println '( + 1 2))          ; => (+ 1 2)
(println  (eval '(+ 1 2)))   ; => 3
(println '(eval  (+ 1 2)))   ; => (eval (+ 1 2))

; def  a var
(def foo 123456)
(print foo)
