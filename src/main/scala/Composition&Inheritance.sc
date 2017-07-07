/*Abstract Class*/

abstract class Element {
  def content: Array[String] //declares the method content but does not define it

  def height: Int = content.length

  def width: Int = if (height == 0) 0 else content(0).length
}


abstract class Element1 {
  def content: Array[String]

  val height: Int = content.length

  val width: Int = if (height == 0) 0 else content(0).length

}

/* Note:- Element and  Element1 both are equivalent,
the only difference is Element1 is faster than Element
because field values are pre computed when class is
initialized, instead of being computed on method call,

But field values require extra memory space in each
Element object
*/


