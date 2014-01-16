package example

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class HelloSpec extends FlatSpec with Matchers {

  "Hello" should "create a simple greeting" in {
    val greeting = Hello.createGreeting(Array())
    greeting should be("Hello!")
  }

  it should "create a greeting with name" in {
    val greeting = Hello.createGreeting(Array("Takashi"))
    greeting should be("Hello Takashi!")
  }

}