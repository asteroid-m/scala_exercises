/*Functional Objects*/
class Rational(n: Int, d: Int) {
  require(d != 0)
  override def toString = n + "/" + d
}

new Rational(3, 5)

class RationalWithMethod(n: Int, d: Int) {
  require(d != 0)

  val num = n
  val deno = d

  override def toString = num + "/" + deno

  def add(rational: RationalWithMethod) = {
    rational.num + rational.deno
  }

  def this(n: Int) = this(n, 1)
}

val x = new RationalWithMethod(1, 5)
val y = new RationalWithMethod(5)

x.num
x.deno

/*Self Reference*/
class RationalWithThis(n: Int, d: Int) {
  val num = n
  val deno = d

  def add(rational: RationalWithThis) = {
    this.num + rational.deno
  }
}

