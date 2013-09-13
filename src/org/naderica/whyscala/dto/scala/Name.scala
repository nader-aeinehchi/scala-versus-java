package org.naderica.whyscala.dto.scala

/**
 * Case classes encourage developers to prefer immutable objects.  When <code>val</code> or <code>var</code> is dropped (default behaviour), Scala creates
 * a <code>val</code> reference, which makes the class immutable.
 * 
 * <p>Here, we are showing the usage of <code>var</code> to illustrate how it matches a mutable Domain Transfer Object (DTO) in Java.
 * 
 * <p>For immutable objects, Scala automatically creates both getters and setters.
 */
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