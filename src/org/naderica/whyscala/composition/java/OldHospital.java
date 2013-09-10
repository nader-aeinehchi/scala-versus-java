package org.naderica.whyscala.composition.java;

public class OldHospital {

	private final String hospitalName;

	private final Patient patient;

	public OldHospital(String hospitalName, Patient patient) {
		super();
		this.hospitalName = hospitalName;
		this.patient = patient;
	}

	public void cure() {
		System.out.println("Our hospital " + hospitalName
				+ " is curing the following patient");
		patient.treat();
	}

	public String getHospitalName() {
		return hospitalName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((hospitalName == null) ? 0 : hospitalName.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OldHospital other = (OldHospital) obj;
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OldHospital [hospitalName=" + hospitalName + ", patient="
				+ patient + "]";
	}

}
