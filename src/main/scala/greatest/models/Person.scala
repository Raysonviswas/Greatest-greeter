package greatest.models

class Person(name : String, age: Int, private val bankAccount: BankAccount) {
  //this is being overridden ot have a extended bank account of savings account
  //secondary constructor default amount for new person
  def this(name: String, age : Int) = {
    this (name, age, new SavingsAccount("12345", 0.00))
  }
  private val years : String = if (age == 1) "a year" else s"$age years"

  def speak() : String = {
  if (name == "adam") { s"You don't get a hello!"
  } else {
    s"Hello $name, you are $years old!\nYour account details are: $bankAccount\n"
  } }
}
