package example

object Hello extends Greeting with App {
  println(greeting)

  /**
    * Sums two integer numbers
    *
    * @param a First number
    * @param b Second Number
    * @return Sum of first and second nubmer
    */
  def sum(a: Int, b: Int): Int = a + b
}

trait Greeting {
  lazy val greeting: String = "hello"
}
