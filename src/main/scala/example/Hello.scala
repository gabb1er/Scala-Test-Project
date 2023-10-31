package example

import scala.annotation.tailrec

object Hello extends Greeting with App {
  println(greeting)

  /**
    * Sums two integer numbers
    *
    * @param a First number
    * @param b Second Number
    * @return Sum of first and second number
    */
  def sum(a: Int, b: Int): Int = a + b

  val n = 10
  println(s"Computed $n-th Fibonacci number: ${fibonacci(n)}")
  val nn = 255
  println(s"Computed $nn-th Fibonacci number: ${fibonacci(nn)}")
  println("Done")
}

trait Greeting {
  lazy val greeting: String = "hello"

  /**
    * Computes n-th Fibonacci number
    *
    * @param n Fibonacci number to compute
    * @return n-th Fibonacci number
    */
  def fibonacci(n: Int): BigInt = {
    @tailrec
    def loop(n: Int, acc1: BigInt, acc2: BigInt): BigInt =
      n match {
        case 0 => acc1
        case 1 => acc2
        case _ => loop(n - 1, acc2, acc1 + acc2)
      }
    
    if (n < 0) throw new IllegalArgumentException("Cannot compute negative Fibonacci number")
    else loop(n, 0, 1)
  }
}
