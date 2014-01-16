import org.junit.Test
import org.scalatest.Assertions

class HelloTest extends Assertions {

  @Test def createGreetingWithEmptyArgs {
    val greeting = Hello.createGreeting(Array())
    assert(greeting == "Hello!")
  }

  @Test def createGreetingWithArgs {
    val greeting = Hello.createGreeting(Array("Takashi"))
    assert(greeting == "Hello Takashi!")
  }

}