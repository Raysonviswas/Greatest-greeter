package greatest
import greatest.models._
import greatest.views.Prompt

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
  val deposited = normalAccount.deposit(300.00)
  val AccountHolder = new Person("Rayson", 22, IndexedSeq(deposited))
  // println(loyal.speak())
  Prompt.reply(AccountHolder.speak())

  val ages = List(1, 25, 31, 14)
  val names = List("adam", "david", "daniel", "david")

  val filtered = for (name <- names if name != "david";
                      if name != "daniel";
                      age <- ages
  ) yield s"\nName: $name, Age: $age"
                                
  println(filtered)

  //val t : (Int, String, Person) = (1, "hello", new Person())
  //val number = t._1
  //val string = t._2
  //val person = t._3
  //t.productIterator.foreach(x => println(x))

  val pet1 = Cat("Felix")
  val pet2 = Dog.withName("bruce")
  //apply() and unapply() methods
  //allows us to instantiate an object, or to deconstruct an object. this is true for case classes or objects
  val pet3 = Dog("Spot", 2)
  val pet4 = Cat("Saqib")

  println(pet1 == pet3)
  println(pet2.speak)
  println(pet2.age)

}