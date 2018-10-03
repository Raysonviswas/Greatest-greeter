package greatest

import greatest.models.Pet

import scala.collection.mutable.ArrayBuffer

abstract class repositories(pet: Pet) {

  private val _pets : ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all() : List[Pet] = _pets.toList
  def findByName(name : String) : Option[Pet] = None
  def dogs() : List[Pet] = _pets.toList
  def cats() : List[Pet] = _pets.toList
  def other() : List[Pet] = _pets.toList
  def add(pet : Pet*) : List[Pet] = _pets.toList
  //Note: The asterisks is syntax for varargs::
  def removeByName(name : String) : List[Pet] = _pets.toList
  def update(pet: Pet) : List[Pet] = _pets.toList



}
