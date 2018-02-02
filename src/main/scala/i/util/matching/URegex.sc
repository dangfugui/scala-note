val str = "Scala is Scalable and cool";
val pattern = "Scala".r
val find1 = pattern findFirstIn str
val findMore = (pattern findAllIn str).mkString(",")

val patt = "(S|s)cala".r
val replaceVal = patt replaceAllIn(str, "Java")
