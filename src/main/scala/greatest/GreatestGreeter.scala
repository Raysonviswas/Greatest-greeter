package greatest
import greatest.models.{BankAccount, CashISAccount, Person, SavingsAccount}
import scala.io.StdIn

object Prompt {
  def ask(message: String): String = StdIn.readLine(message)
}

object GreatestGreeter extends App {
/*  val name = Prompt.ask("What is your name? ")
  val age = Prompt.ask("What is your age? ")
  val person = new Person(name, age.toInt)
  println(person.speak())*/
/*val name2 = Prompt.ask("What is your name? ")
  val age2 = Prompt.ask("What is your age? ")
  val cashISA = new CashISAccount("45676", 0.0)
  //creating new instance of cash isa called deposited with same account number
  val deposited = cashISA.deposit(1000.00)
  //creating new instance of cash isa called withdrawn with same account number
  val withdrawn = deposited.withdraw(200.00)
  //passing cashISA called withdrawn into person
  val person2 = new Person(name2, age2.toInt, deposited)

  println(person2.speak())*/
  val normalAccount = new CashISAccount("l33t", 100)
  val loyalAccountDeposited = normalAccount.deposit(300.00)
  val loyal = new Person("Loyal customer", 22, loyalAccountDeposited)

  println(loyal.speak())

}