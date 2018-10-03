package greatest.models

class Person(name : String, age: Int, val bankAccounts: Seq[BankAccount] = Nil) {

  private val excluded = List("Adam", "Daniel", "John")

  //this is being overridden ot have a extended bank account of savings account
  //secondary constructor default amount for new person
  def this(name: String, age : Int) = {
//    val updatedAccounts = bankAccounts :+ new SavingsAccount("l33t", 0.00)
    this (name, age, Seq(new SavingsAccount("l33t", 0.00)))
  }
  private val years : String = if (age == 1) "a year" else s"$age years"

  def speak() : String = {
  if (excluded.contains(name)) { s"You don't get a hello!"
  } else {
    s"Hello $name, you are $years old!\nYour account details are: $bankAccounts\n"
  } }
}
