package i.note

import scala.util.control.Breaks

object Grammar {

  def while1(index :Int): Unit ={
    var i = 0
    while(i<index){
      println(i)
      i = i + 1
    }
    do{
      println(i)
    }while(i<index)

  }
  def for1(list: List[Int]): Unit ={
    for(i <- list){
      println(i)
    }
    val loop = new Breaks
    loop.breakable{
    for(i <- 0 until 3) {
      if (i == 3) loop.break()
        println(i)
      }
    }
  }
  def exception(): Unit ={
    try{
      throw new IllegalArgumentException(" haha ")
    }catch {
      case ex :IllegalArgumentException => println(ex.getMessage)
    }finally{
      println("finally")
    }
  }


  def main(args: Array[String]): Unit = {
    // while1(3)
//    for1(list = (1 to 3 ).toList)
    exception()
  }
}
