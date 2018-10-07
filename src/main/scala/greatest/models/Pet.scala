package greatest.models

sealed trait Pet{
  val name: String
  def speak: String = "Woof!"
}

final case class Cat(override val name: String) extends Pet {
  override def speak: String = "Meow!"
}


final case class Dog(override val name: String, private val personYears : Int) extends Pet {
  import Dog._
  def age = calculateAgeInDogYears(personYears)
}

object Dog {
  def withName(name : String) = new Dog(name, 2)
  private def calculateAgeInDogYears(age : Int) = age * 7
}

//val d = Dog.withName("bruce").age

