( ns func )


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
( defn greet_all
  ([f] (print (str "s-Hello " f "\n")))
  ([f & r]
    (print (str "m-Hello " f "\n"))
    ;(greet_all (first r)(rest r))))
    (greet_all r)))


;( greet_all "foo")
( greet_all "foo" "bar" "third")
