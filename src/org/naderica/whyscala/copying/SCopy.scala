package org.naderica.whyscala.copying

/**
 * This code shows the built-in <code>copy</code> method of case classes.
 * 
 */
case class SCopy(val firstName: String, val lastName: String)

object SCopyTest {
  def main(args: Array[String]) {

    val scalaInventor = SCopy("Martin", "Odersky")
    
    
    val hybridInventor = scalaInventor.copy(firstName = "James")
    val javaInventor = hybridInventor.copy(lastName = "Gosling")
    
    println(scalaInventor)
    println(hybridInventor)
    println(javaInventor)
  }
}