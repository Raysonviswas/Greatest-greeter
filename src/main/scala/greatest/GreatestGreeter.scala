package greatest
import scala.io.StdIn

class Person(name : String, age: Int) {
  private val years : String = if (age == 1) "a year" else s"$age years"

  def speak() : String = {
  if (name == "adam") { s"You don't get a hello!"
  } else {
    s"Hello $name, you are $years old!"
  } }
}

object Prompt {
def ask(message: String): String = StdIn.readLine(message)
}

object GreatestGreeter extends App {
  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("What is your age? ")
  val person = new Person(name, age.toInt)

  val acc = {
    new CashISAccount("12345", 24.5)
  }

  acc.deposit(22)

  println(person.speak())
  println(acc.balance)
}
