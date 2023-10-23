package example

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyWordSpec with Matchers {
  "Hello object" should {
      "say hello" in {
        Hello.greeting shouldEqual "hello"
    }
  } 
}