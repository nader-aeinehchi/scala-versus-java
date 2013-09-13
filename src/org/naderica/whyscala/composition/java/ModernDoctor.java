package org.naderica.whyscala.composition.java;

public class ModernDoctor {
	public static void main(String[] args) {
		final ModernDoctor traditionalDoctor = new ModernDoctor("Doctor PC",
				"Ali Baba", "Modern Rey Shahr Hospital");

		traditionalDoctor.cure();
		System.out.println("-----------------------");
		traditionalDoctor.treat();
		System.out.println("-----------------------");
		traditionalDoctor.payment.getPaid("2000");

	}

	private final String name;
	private final Patient patient;
	private final ModernHospital modernHospital;

	private final Payment payment = new Payment();

	public ModernDoctor(String name, String patientName, String hospitalName) {
		this.name = name;
		this.patient = new Patient(patientName);
		this.modernHospital = new ModernHospital(hospitalName, this.patient);

	}

	public void cure() {
		System.out.println("Our hospital "
				+ this.modernHospital.getHospitalName()
				+ " is curing the following patient");
		treat();
	}

	public void treat() {
		this.modernHospital.treat();
	}

	public void getPaid(final String amount){
		this.payment.getPaid(amount);
	}

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
		ModernDoctor other = (ModernDoctor) obj;
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.modernHospital == null) {
			if (other.modernHospital != null) {
				return false;
			}
		} else if (!this.modernHospital.equals(other.modernHospital)) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.name == null) ? 0 : this.name.hashCode());
		result = prime
				* result
				+ ((this.modernHospital == null) ? 0 : this.modernHospital
						.hashCode());
		result = prime * result
				+ ((this.patient == null) ? 0 : this.patient.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "TraditionalDoctor [name=" + this.name + ", patient="
				+ this.patient + ", modernHospital=" + this.modernHospital
				+ "]";
	}

}
