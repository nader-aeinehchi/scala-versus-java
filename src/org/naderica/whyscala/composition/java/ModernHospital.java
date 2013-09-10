package org.naderica.whyscala.composition.java;

public class ModernHospital {

	private final String hospitalName;

	private final Patient patient;

	public ModernHospital(String hospitalName, Patient patient) {
		super();
		this.hospitalName = hospitalName;
		this.patient = patient;
	}

	public void cure() {
		System.out.println("Our hospital " + this.hospitalName
				+ " is curing the following patient");
		this.patient.treat();
	}

	public void treat() {
		System.out.println("Intercepting the original treatment");
		this.patient.treat();
		System.out.println("Interception finished");
	}
	

//    override def treat {
//    println("Intercepting the original treatment")
//    super.treat
//    println("Interception finished")
//  }
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ModernHospital other = (ModernHospital) obj;
		if (this.hospitalName == null) {
			if (other.hospitalName != null) {
				return false;
			}
		} else if (!this.hospitalName.equals(other.hospitalName)) {
			return false;
		}
		if (this.patient == null) {
			if (other.patient != null) {
				return false;
			}
		} else if (!this.patient.equals(other.patient)) {
			return false;
		}
		return true;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((this.hospitalName == null) ? 0 : this.hospitalName
						.hashCode());
		result = prime * result
				+ ((this.patient == null) ? 0 : this.patient.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "ModernHospital [hospitalName=" + this.hospitalName
				+ ", patient=" + this.patient + "]";
	}



}
