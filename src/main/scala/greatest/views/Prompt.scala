package greatest.views

import scala.io.StdIn

object Prompt {
  def ask(message: String): String = StdIn.readLine(message)
  def reply(message: String) = println(message)
}
