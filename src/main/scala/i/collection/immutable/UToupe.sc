/** toupe **/
val t1 = (1,2);
val t2 = 1 -> 2
val t3 = (1, "Alice" ,"Math", 95.5)
val tname = t3._2

def sumSq(list: List[Int]) :(Int, Int, Int)={
  // count  sum  平方和
  list.foldLeft((0,0,0))((t, v) =>(t._1 + 1,t._2 + v ,t._3 + v * v))
}
val res = sumSq(List(1,2,3))

