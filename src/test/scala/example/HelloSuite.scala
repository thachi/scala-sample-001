package example

import org.scalatest.FunSuite
import example.Hello

class HelloSuite extends FunSuite {

  test("引数を指定しない場合に\"Hello!\"が取得できる") {
    val actual = Hello.createGreeting(Array())
    assert(actual == "Hello!")
  }

  test("引数に\"Takashi\"を指定した場合に\"Hello Takashi!\"が取得できる") {
    val actual = Hello.createGreeting(Array("Takashi"))
    assert(actual == "Hello Takashi!")
  }

}