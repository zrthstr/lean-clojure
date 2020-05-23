( ns func )

( defn no_arg_func
  ( [] ( print "no arg\n")))

( defn one_arg_func
  ( [first] (print (str "one arg: " first "\n"))))

( defn rand_arg_func [& some]
  ( print (str "numb of args: ", (count some) "\n")))

( no_arg_func )
( one_arg_func "some_arg")
( rand_arg_func 0 1 2 4 5 6)
