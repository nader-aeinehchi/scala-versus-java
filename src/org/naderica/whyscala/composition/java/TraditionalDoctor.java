package org.naderica.whyscala.composition.java;

public class TraditionalDoctor {
	public static void main(String[] args) {
		final TraditionalDoctor traditionalDoctor = new TraditionalDoctor(
				"Avicenna", "Sanbad", "Old Rey Shahr Hospital");

		traditionalDoctor.cure();
		System.out.println("-----------------------");
		traditionalDoctor.treat();
		System.out.println("-----------------------");
		traditionalDoctor.payment.payBill("1000");

	}

	private final String name;
	private final Patient patient;
	private final OldHospital oldHospital;

	private final Payment payment = new Payment();

	public TraditionalDoctor(String name, String patientName,
			String hospitalName) {
		this.name = name;
		this.patient = new Patient(patientName);
		this.oldHospital = new OldHospital(hospitalName, this.patient);

	}

	public void cure() {
		System.out.println("Our hospital " + this.oldHospital.getHospitalName()
				+ " is curing the following patient");
		this.patient.treat();
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
		TraditionalDoctor other = (TraditionalDoctor) obj;
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.oldHospital == null) {
			if (other.oldHospital != null) {
				return false;
			}
		} else if (!this.oldHospital.equals(other.oldHospital)) {
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
				+ ((this.oldHospital == null) ? 0 : this.oldHospital.hashCode());
		result = prime * result
				+ ((this.patient == null) ? 0 : this.patient.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "TraditionalDoctor [name=" + this.name + ", patient="
				+ this.patient + ", oldHospital=" + this.oldHospital + "]";
	}

	public void treat() {
		this.patient.treat();
	}

}
