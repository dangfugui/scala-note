
/** 快排 **/

def quickSort(list : List[Int]):List[Int]={
  if(list.length < 2) list
  else {
    quickSort(list.filter(_ < list.head)) ++
      list.filter(_ == list.head) ++
      quickSort(list.filter(_ > list.head))
  }
}

val list = List(1,1,5,9,4,1,6,5,7,2,5);
val sortList = quickSort(list)