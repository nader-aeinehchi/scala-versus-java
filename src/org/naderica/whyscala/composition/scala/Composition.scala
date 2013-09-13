package org.naderica.whyscala.composition.scala

object Composition {
  def main(args: Array[String]) {
    val traditionalDoctor = TraditionalDoctor("Avicenna", "Sanbad", "Old Rey Shahr Hospital")

    traditionalDoctor.cure
    println("-----------------------")
    traditionalDoctor.treat
    println("-----------------------")
    traditionalDoctor.getPaid("1000")

    println("=====================================")
    val modernDoctor = ModernDoctor("Doctor PC", "Ali Baba", "Modern Rey Shahr Hospital")

    modernDoctor.cure
    println("-----------------------")
    modernDoctor.treat
    println("-----------------------")
    modernDoctor.getPaid("2000")
  }
}

trait Patient {
  val patientName: String

  def treat {
    println("My name is " + patientName + " and am being now treated")
  }
}

/**
 * Here, <code>OldHospital</code> mixes the <code>Patient</code> traits without inheritance.
 */
trait OldHospital {
  /*
   * Here, we use a special technique.  This following says: "A class that uses OldHospital must also use Patient trait.".  
   * That is why we can use the "treat" method of the patient class here. 
   */
  this: Patient =>
  val hospitalName: String

  def cure {
    println("Our hospital " + hospitalName + " is curing the following patient")
    treat
  }
}

/**
 * Here, <code>ModernHospital</code> simply inherits from another trait <code>Patient</code>.
 * This is inheritance solution with its advantages and disadvantages.
 */
trait ModernHospital extends Patient {
  val hospitalName: String

  def cure {
    println("Our hospital " + hospitalName + " is curing the following patient")
    treat

  }

  override def treat {
    println("Intercepting the original treatment")
    super.treat
    println("Interception finished")
  }
}

trait Payment {
  def getPaid(amount: String) {
    println("Paying the bill for the amount " + amount)
  }
}

/**
 * A class can inherit from only one other class.  A class can also inherit from traits.  For the first class or trait, it "extends" while for the remaining
 * traits is "uses".
 */
case class TraditionalDoctor(val name: String, val patientName: String, val hospitalName: String) extends OldHospital with Patient with Payment
case class ModernDoctor(val name: String, val patientName: String, val hospitalName: String) extends ModernHospital with Payment 