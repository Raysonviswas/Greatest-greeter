package greatest.models

abstract class BankAccount (val accountNumber: String, val balance: Double) {

  def withdraw(amount: Double): BankAccount
  def deposit(amount: Double): BankAccount

  override def toString: String = s"Account number: $accountNumber, balance : $balance"

}
