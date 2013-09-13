package org.naderica.whyscala.singleton.scala

/**
 * Objects are singletons in Scala.
 */
object Printer {

  /**
   * Denotes default printer which is set to "A4" and Black-and-White"
   */
  val default = Printer("A4", false)

  /**
   * Denotes a second printer for printing large colored pages
   */
  val * = Printer("A3", true)

  /**
   * Prints using the default printer
   */
  def print(message: String) = default.print(message)

  /**
   * Denotes a simple scanner that either scans or prints
   */
  val manualMachine = new Printer("A4", true) with Scanner
  
  /**
   * Denotes a machine that first scans and then print a document.  Here, we compose a trait.
   */
  val automaticMachine = new Printer("A2", true) with Scanner{
    override def process(document:String){
      //You need super to avoid endless recursion.
      super.process(document)
      print(document)
    }
  }
}

case class Printer(val paperSize: String, val colored: Boolean) {
  def print(message: String) {

    println("Printing using PaperSize=" + paperSize + " ColorFormat=" + colored + " Message=" + message)
  }
}

trait Scanner {
  def process(document: String) {
    println("Scanning the document=" + document)
  }
}

object PrinterTester {

  def main(args: Array[String]) {

    val printer1 = Printer("A3", true)
    printer1 print "Printing using an instance"

    println("-----------------------------------")
    Printer.default print "Printing using the singleton's default printer"
    Printer.* print "Printing using the singleton's large printer"
    
    println("-----------------------------------")
    Printer.manualMachine process "Scanner my book using scanner as a separate operation"
    Printer.manualMachine print "Printing my book using scanner as a separate operation"
    
    println("-----------------------------------")
    Printer.automaticMachine process "Printing and scanning my book using comboMachine as a combo operation"
  }
}