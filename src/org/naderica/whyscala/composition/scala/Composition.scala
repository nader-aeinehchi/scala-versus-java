package org.naderica.whyscala.composition.scala

object Composition {
  def main(args: Array[String]) {
    val traditionalDoctor = TraditionalDoctor("Avicenna", "Sanbad", "Old Rey Shahr Hospital")

    traditionalDoctor.cure
    println("-----------------------")
    traditionalDoctor.treat
    println("-----------------------")
    traditionalDoctor.payBill("1000")

    println("=====================================")
    val modernDoctor = ModernDoctor("Doctor PC", "Ali Baba", "Modern Rey Shahr Hospital")

    modernDoctor.cure
    println("-----------------------")
    modernDoctor.treat
    println("-----------------------")
    modernDoctor.payBill("2000")
  }
}

trait Patient {
  val patientName: String

  def treat {
    println("My name is " + patientName + " and am being now treated")
  }
}

trait OldHospital {
  this: Patient =>
  val hospitalName: String

  def cure {
    println("Our hospital " + hospitalName + " is curing the following patient")
    treat
  }
}

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
  def payBill(amount: String) {
    println("Paying the bill for the amount " + amount)
  }
}

case class TraditionalDoctor(val name: String, val patientName: String, val hospitalName: String) extends OldHospital with Patient with Payment
case class ModernDoctor(val name: String, val patientName: String, val hospitalName: String) extends ModernHospital with Payment 