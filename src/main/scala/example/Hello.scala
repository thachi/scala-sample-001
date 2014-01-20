package example

import com.typesafe.scalalogging.log4j.Logging

object Hello extends Logging {

  def main(args: Array[String]) {
    println(createGreeting(args))
  }

  def createGreeting(args: Array[String]) = {

    logger.info("args size:" + args.length)

    args.headOption match {
      case Some(name) => "Hello " + name + "!"
      case None => "Hello!"
    }
  }

}
