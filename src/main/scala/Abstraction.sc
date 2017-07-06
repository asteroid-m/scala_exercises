import java.io.{PrintWriter, File}

import scala.collection.concurrent
import scala.collection.concurrent.RDCSS_Descriptor

/* Higher Order Function */
object FileMatcher {
  val files: Array[File] = new File(".").listFiles

  def fileMatching(matcher: String => Boolean): Array[File] = {
    for {file <- files
         if matcher(file.getName)
    } yield file
  }

  def fileEndsWith(query: String): Array[File] = {
    fileMatching(_.endsWith(query))
  }

}

FileMatcher.fileEndsWith("pdf")
def containsNg(nums: List[Int]): Boolean = nums.exists(_ < 0)
containsNg(List(1, 2, 3, 4))
/* Currying */
def simpleFunc(a: Int, b: Int): Int = a + b

simpleFunc(2, 3)

def curriedFunction(a: Int)(b: Int): Int = a + b

curriedFunction(1)(2)

def curriedFunctionExp(a: Int) = (b: Int) => a + b

val secondValue = curriedFunctionExp(2)

secondValue(3)

val onePlus = curriedFunction(3) _

onePlus(4)

/* Writing control structure */

def multiply(op: Int => Int, x: Int) = op(x)

multiply(_ + 2, 3)

def writeOnFile(file: File, writer: PrintWriter => Unit) = {
  val print = new PrintWriter(file)
  try {
    writer(print)
  } finally print.close()
}

writeOnFile(new File("/home/asteroid-m/test"), writer => writer.println("let's start here "))
