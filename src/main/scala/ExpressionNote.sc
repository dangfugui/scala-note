object DefNote {
  def hello(name: String): String = {
    s"hello ${name}"
  }

  hello("dang")

  def fbnq(index: Int): Int = {
    if (index <= 2) {
      return 1;
    }else {
      return fbnq(index - 1) + fbnq(index - 2)
    }
  }
  fbnq(4)

  def add(x:Double, y:Double) = x + y
  add(1,2)

  val list = List("a","b","c");
  val filterList = for{
    s <- list
    s1 = s.toUpperCase()
    if(s != "")  // filter
  }yield (s1)

  for{
    s <- filterList;
    if(s != "")
  } println(s)

  var count = try{
    Integer.parseInt("dog")
  }catch {
    case _ => 0
  }finally {
    println("count")
  }
count = 1
  val count_match = count match {
    case 0 => "零"
    case 1 => "一"
    case _ => "others";
  }






}