/*
Ch 8:- Functions and Closure
*/
/* Method */
object MethodExample {
  def sum(a: Int, b: Int, c: Int): Int = {
    multiply(a + b, c)
  }

  private def multiply(sum: Int, c: Int): Int = {
    sum * c
  }
}

object LocalMethod {
  def sum(a: Int, b: Int, c: Int): Int = {
    def multiply(sum: Int, c: Int): Int = sum * c
    multiply(a + b, c)
  }
}

MethodExample.sum(1, 2, 3)
println("*********Separator**********")
/* First Class Function */
/* function literal (exists in source code) */
(x: Int) => x + 1
println("*********Separator**********")
/* function values (exists as an object at runtime) */
val fValue = (x: Int) => {
  println
  x + 1
}
fValue(10)

println("*********Separator**********")
/* foreach using function literal */

val list = List(1, 2, 4, 5, 7, 8)
list foreach (x => println(x * 2 + "\n"))

println("*********Separator**********")
/* Partially applied functions */

def sum(a: Int, b: Int) = a + b

val noneArguments = sum _
val someArgument = sum(_: Int, 3)
noneArguments(1, 2)
someArgument(2)

println("*********Separator**********")
/* Closure */

val more = 20 // free variable
val result = (x: Int) => x + more //x: bound variable
def createNewCloser(more: Int) = (x: Int) => x + more
val a = createNewCloser(50)
a(200)

println("*********Separator**********")
/* Tail Recursion */
def boom(x: Int): Int = {
  if (x == 0) {
    println("BOOM !!!")
    0
  }
  else boom(x - 1) // executed in single stack frame
}

boom(5)

println("*********Separator**********")
/* Head Recursion */
def bang(x: Int): Int = {
  if (x == 0) throw new Exception("BANG !!!")
  else bang(x - 1) + 1 // added 1 after making recursive call
}

bang(5)