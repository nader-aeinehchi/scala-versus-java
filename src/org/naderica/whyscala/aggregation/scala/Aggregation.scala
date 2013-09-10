package org.naderica.whyscala.aggregation.scala

object SComposition {

  def main(args: Array[String]) {
    val name = Name("Martin", "Odersky")
    val address = Address("some street", "some city", "Switzerland")
    val electronicAddress = ElectronicAddress("123456789", "martin.odersky@scala.programming.language")
    val person = Person(name, address, electronicAddress)
    println(person)

  }

}

case class Name(val firstName: String, val lastName: String)
case class Address(val street: String, val city: String, val country: String)
case class ElectronicAddress(val phone: String, val email: String)

case class Person(val name: Name, val address: Address, val electronicAddress: ElectronicAddress)