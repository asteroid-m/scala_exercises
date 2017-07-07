/*Abstract Class*/
abstract class Element {  //implicitly extends class AnyRef
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

class ArrayElement(arr: Array[String]) extends Element {

  def content: Array[String] = arr

}

new ArrayElement(Array("a", "b", "c"))

/* Above defined extend has two effects:-
1. It makes class ArrayElement to inherit all non private
members of class Element

2. and It makes the type ArrayElement a subtype of
the type Element
 */

