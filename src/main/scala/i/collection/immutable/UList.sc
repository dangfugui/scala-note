
val a1 = List(1,2,3,4)
val a2 = 0 :: a1   // ::连接操作符
val a3 = a1 ++ List(5,6)
val a_head =  a1.head
val a_tail = a1.tail
val a1_filter = a1.filter(x => x % 2 == 1)


def walkthru(l :List[Int]):String ={
  if(l.isEmpty) " "
  else l.head.toString + "," + walkthru(l.tail)
}

val res = walkthru(a2)

val c1 = "x" :: "y" :: "z" :: Nil  // Nil  为空列表
val ac = a1 ::: c1
/**  map 高阶函数  */
var c1Up = c1.map(_.toUpperCase())  // _ 通配符  自动判断_为 String

/** List 高阶函数 */
val d1 = "99 Red Balloons 12".toList
val d1_num = d1.filter(s => Character.isDigit(s)) //val d1_num = d1.filter(Character.isDigit(_))
val d1_B = d1.toList.takeWhile(s => s!='B')


val e1 = List(a1, List(5, 6, 7, 8))
val e2 = e1.map(l => l.filter(v => v % 2 == 0))
val e3 = e1.map(_.filter(_ % 2 == 0).map(_ + 1))
val e4 = e1.flatMap(_.filter(_ % 2 == 0))
/** 规约 reduceLeft（op: (T, T) => T） */
val r = List(12.0, 2 ,3)
val rl = r.reduceLeft(_ / _)    // 12/2/3
val vr = r.reduceRight(_ / _)   // 12/(2/3)
val rf = r.foldLeft(120.0)(_ / _) //120.0/12/2/3
val rfl = r.foldRight(2.0)(_ / _) // 12/(2/(3/2.0))

/** range **/
val t1 = 0 to 10
val t2 = 0 to 10 by 2
val t3 = t2.toList
val t4 = t2.toStream
