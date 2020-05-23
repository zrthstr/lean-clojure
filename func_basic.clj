
( ns func )

( defn somefunc
  ( [] ( print "no arg\n"))
  ( [first] (print (str "one arg:" first "\n"))))


( somefunc )
( somefunc "some_arg")
