package greatest

abstract class BankAccount (val accountNumber: String, val balance: Double) {

  def withdraw(amount: Double): BankAccount
  def deposit(amount: Double): BankAccount

  override def toString: String = s"Account number: $accountNumber, balance : $balance"

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

final class CashISAccount (accountNumber: String, balance: Double, private val depositThreshold : Double = 200.00) extends BankAccount(accountNumber, balance ){

  override def withdraw(amount: Double): BankAccount = {
    println(s"You can't withdraw yet, your money is locked in for 3 years!!! And... we've reduced your APR to 0.2%!")
    this
  }

  override def deposit(amount: Double): BankAccount = {

    if (amount > depositThreshold) {

      val difference = amount - depositThreshold

      println(s"You can't deposit more than £$depositThreshold. Excess: £$difference.")

      new CashISAccount(accountNumber, balance + depositThreshold)

    } else {

      new CashISAccount(accountNumber, balance + amount)

    }
  }

}


