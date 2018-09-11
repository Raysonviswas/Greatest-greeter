package Greatest

abstract class BankAccount (val accountNumber: String, val balance: Double) {
  def withdraw(amount: Double): BankAccount
  def deposit(amount: Double): BankAccount

}
final class SavingsAccount (accountNumber: String, balance: Double) extends BankAccount(accountNumber, balance ){
  override def withdraw(amount: Double): BankAccount = {
    if ((balance - amount) < 0) {
      println("You have insufficient funds")
      this
    } else {
      val deducted = balance - amount
      println(s"Balance after deductions: $deducted")
      new SavingsAccount(accountNumber, deducted) }
  }
  override def deposit(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance + amount)
}

final class CashISAccount (accountNumber: String, balance: Double) extends BankAccount(accountNumber, balance ){
  override def withdraw(amount: Double): BankAccount = {
    println("you can't withdraw out of a ISA until you close it")
    this
  }
  override def deposit(amount: Double): BankAccount = new CashISAccount(accountNumber, balance + amount)

}


