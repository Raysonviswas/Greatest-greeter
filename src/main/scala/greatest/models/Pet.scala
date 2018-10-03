package greatest.models

sealed trait Pet{
  val name: String
  def speak: String = "Woof!"
}

final class Cat(override val name: String) extends Pet {
  override def speak: String = "Meow!"
}

final class Dog(override val name: String) extends Pet {

}