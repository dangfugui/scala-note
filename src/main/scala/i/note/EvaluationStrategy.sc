//  策略

/**
  * all By value
  */
def change(x :Int, y:Int): Int = x * x
// call By name
def change2(x : =>Int, y: =>Int ): Int = x * x

change2(2,2*3)

/**  高阶函数： 用函数作为形参或者返回值的函数  */
// 接收一个(Int,Int)为参数的函数并且返回值为=> Int  :Int operate返回Int
def operate(f:(Int, Int)=> Int): Int = {
  f(4,4);
}
var ans = operate(change)
//                返回一个(String)为参数的函数
def greeting() = (name :String) =>{"hello " + name }
var str = greeting()("dang")


/** 匿名函数:就是函数常亮，也称为函数文字量 */
var noname = (x: Int) => x * x
noname(2)


/** 柯里化：  把具有多个参数的函数转换为一条 都是单一参数的函数链条 */
def add(x:Int, y: Int):Int =  x + y
def add2(x:Int)(y:Int) = x + y
var addRes = add2(1)(2)
val addOne = add2(1)_     // _统配addOne的参数
var ans3 = addOne(2)

/**  递归函数  */
def factorial(n:Int):Int = {
  if(n<=0) 1
  else n * factorial(n - 1)
}
var fa = factorial(3);

/**  尾递归函数：  所有递归形式的调用都出现在函数的末尾，当编译器检测到一个函数是尾递归函数的时候、
  * ，他就会覆盖当前的活动记录而不是在栈中去创建一个新的  */
@annotation.tailrec
def factorial2(n:Int,m:Int):Int = {
  if(n <= 0) m
  else factorial2( n - 1,m * n)
}
factorial2(5, 1)





