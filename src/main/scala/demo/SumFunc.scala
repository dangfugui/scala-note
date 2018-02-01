package demo;

/**
  * 的f(x)  在 a 到 b 的 累加和     ∑(a,b) f(x)
  */
object SumFunc {
  def sum(f: Int => Int )(a: Int)(b: Int): Int ={
    @annotation.tailrec
    def loop(n: Int, sum: Int): Int = {
      println(s"n=${n},  sum=${sum}")
      if(n>b) sum
      else loop(n + 1,sum + f(n))
    }
    loop(a, 0)
  }

  def main(args: Array[String]): Unit = {
    val ans1 = sum(x => x * x)(1)(5)
    println(ans1)

    val ans2 = sum(x => x * x * x )(1)(5)
    println(ans2)
  }
}
