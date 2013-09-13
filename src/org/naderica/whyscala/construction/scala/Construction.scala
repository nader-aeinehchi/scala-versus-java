package org.naderica.whyscala.construction.scala

object ConstructionTester {

  def main(args: Array[String]) {
    val foo = new Foo("Martin Odersky")
    println(foo)

    val acme1 = new Acme("Martin Odersky")
    println(acme1)

    val acme2 = Acme("Martin Odersky")
    println(acme2)

    val mutableAcme = MutableAcme("Martin Odersky")
    println(mutableAcme)
    mutableAcme.name = "James Gosling"
    println(mutableAcme)

    /*
     * Shows that case classes automatically generate equals and hashCode methods.
     */
    val acme3 = Acme("Martin Odersky")
    println(acme2 == acme3)

    /*
     * Using apply method, new is dropped.
     */
    val omni = Omni("Martin Odersky")
    println(omni)

    /*
     * Uses the apply method with two arguments.
     */
    val mars = Mars("Martin Odersky", true)
    println(mars)

    /*
     * Using a factory
     */
    println("Using factory.....")
    println($.*("Marting Odersky"))
    println($.+("Marting Odersky"))
    println($.-("Marting Odersky"))
    println($./("Marting Odersky"))
    println($./("Marting Odersky", false))

  }
}

/**
 * Note that this class is not a case class.  Therefore, important methods like <code>toString</code>,
 * <code>hashCode</code> or <code>equals</code> are not automatically generated.
 */
class Foo(val name: String)

/**
 * Note that this class is a case class.  Therefore, important methods like <code>toString</code>,
 * <code>hashCode</code> or <code>equals</code> are automatically generated.
 *
 * <p>Case classes let instantiate without <code>new</code> keyword.
 *
 * <p>This class is immutable.
 */
case class Acme(val name: String)

/**
 * Note that this class is a case class.  Therefore, important methods like <code>toString</code>,
 * <code>hashCode</code> or <code>equals</code> are automatically generated.
 *
 * <p>Here, the default is set to <code>val</code>
 *
 * <p>Case classes let instantiate without <code>new</code> keyword.
 *
 * <p>This class is immutable.
 */
case class Acme2(name: String)

/**
 * Note that this class is a case class.  Therefore, important methods like <code>toString</code>,
 * <code>hashCode</code> or <code>equals</code> are automatically generated.
 *
 * <p>Case classes let instantiate without <code>new</code> keyword.
 *
 * <p>This class is mutable.
 */
case class MutableAcme(var name: String)

/**
 * Here, we use a companion object (singleton) that has an apply method. It helps create an instance of
 * <code>Omni</code> without providing <code>new</code> keyword.
 *
 * <p>Note that, we have intentionally [in this example] not made the class a case class.  Furthermore, we have intentionally not overridden <code>toString</code> method
 * so that <code>println(someOmniInstance</code> writes something like <code>org.naderica.whyscala.construction.scala.Omni@331f2ee1</code>.
 */
class Omni(val name: String)
object Omni {
  def apply(name: String): Omni = new Omni(name)
}

/**
 * Same as <code>Mars</code> with some extensions.
 */
class Mars(val name: String) {
  override def toString(): String = name
}
object Mars {

  def apply(name: String): Mars = new Mars(name)

  def apply(name: String, uppercase: Boolean): Mars = {
    if (uppercase) (new Mars(name.toUpperCase()))
    else (new Mars(name))
  }
}

/**
 * Represents a factory.  All the symbols are arbitrary and could be any character or word.
 */
object $ {

  def *(name: String) = new Foo(name)
  def +(name: String) = Acme(name)
  def -(name: String) = Omni(name)
  def /(name: String, uppercase: Boolean = true) = Mars.apply(name, uppercase)
}

