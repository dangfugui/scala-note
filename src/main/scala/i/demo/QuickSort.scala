package i.demo

/**
  * 快排
  */
object ISort {
  def quickSort(list : List[Int]):List[Int]={
    if(list.length < 2) list
    else {
      quickSort(list.filter(_ < list.head)) ++
      list.filter(_ == list.head) ++
      quickSort(list.filter(_ > list.head))
    }
  }

  def main(args: Array[String]): Unit = {
   val ans = quickSort(List(1,1,6,8,1,4,5,7,6,6,8,4))
    println(ans)
  }
}
