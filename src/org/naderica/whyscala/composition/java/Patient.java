package org.naderica.whyscala.composition.java;

public class Patient {

	private final String patientName;

	public Patient(String patientName) {
		super();
		this.patientName = patientName;
	}
	
	public void treat(){
		System.out.println("My name is " + patientName + " and am being now treated");
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
		Patient other = (Patient) obj;
		if (this.patientName == null) {
			if (other.patientName != null) {
				return false;
			}
		} else if (!this.patientName.equals(other.patientName)) {
			return false;
		}
		return true;
	}

	public String getPatientName() {
		return this.patientName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((this.patientName == null) ? 0 : this.patientName.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + this.patientName + "]";
	}

}
