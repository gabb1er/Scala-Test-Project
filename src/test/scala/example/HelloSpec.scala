package example

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyWordSpec with Matchers {
  "Hello object" should {
    "say hello" in {
        Hello.greeting shouldEqual "hello"
    }
    "Correctly compute Fibonacci number" in {
      val cases = Seq(
        (0, BigInt(0)),
        (1, BigInt(1)),
        (2, BigInt(1)),
        (5, BigInt(5)),
        (12,BigInt(144))
      )

      cases.foreach{ t =>
        Hello.fibonacci(t._1) shouldEqual t._2
      }
    }

    "Throw error when attempting to compute negative Fibonacci number" in {
      an [IllegalArgumentException] should be thrownBy Hello.fibonacci(-1)
    }
  } 
}