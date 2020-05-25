( ns func )

; fn
(fn [] "hello world") ; => fn
((fn [] "hello world")) ; => "hello world"


; defn 

( defn no_arg_func
  ( [] ( print "no arg\n")))

( no_arg_func )



( defn one_arg_func
  ( [first] (print (str "one arg: " first "\n"))))

( one_arg_func "some_arg")



( defn rand_arg_func [& some]
  ( print (str "numb of args: ", (count some) "\n")))

( rand_arg_func 0 1 2 4 5 6)



;( defn greet_all [f & r]
( defn greet_all0
  ([f] (print (str "s-Hello " f "\n")))
  ([f & r]
    (print (str "m-Hello " f "\n"))
    ;(greet_all (first r)(rest r))))
    (greet_all0 r)))


;( greet_all "foo")
( greet_all0 "foo" "bar" "third")


(defn greet_all1 
  ([] (println "done") )
  ([& args] (println "ddd" (first args)) (if (> (count args) 1) (greet_all1 (rest args)) )))

( greet_all1 "foo1" "bar1" "third1")
