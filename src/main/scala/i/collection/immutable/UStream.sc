/** range **/
val a1 = 0 to 10
val a2 = 0 to 10 by 2
val al = a2.toList

/** stream 惰性求值 **/
val s1 = 1 #:: 2 #:: 3#:: Stream.empty
val sh = s1.head
val st = s1.tail
