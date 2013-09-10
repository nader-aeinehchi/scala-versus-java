package org.naderica.whyscala.dto.scala

case class Name(var firstName: String, var lastName: String)

object Name {
  def main(args: Array[String]) {
    val name = new Name("Ali", "Baba")
    println(name)

    name.firstName = "Donald"
    name.lastName = "Duck"
    println(name)

  }
}