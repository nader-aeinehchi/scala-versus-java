package org.naderica.whyscala.aggregation.java;

public class Aggregation {

	private Name name;
	private final Address address;
	private final ElectronicAddress electronicAddress;

	public static void main(String[] args) {

		final Name name = new Name("Martin", "Odersky");
		final Address address = new Address("some stree", "some city",
				"Switzerland");
		final ElectronicAddress electronicAddress = new ElectronicAddress(
				"123456789", "martin.odersky@scala.programming.language");

		final Aggregation person = new Aggregation(name, address,
				electronicAddress);
		
		System.out.println(person);

	}

	public Aggregation(Name name, Address address,
			ElectronicAddress electronicAddress) {
		super();
		this.name = name;
		this.address = address;
		this.electronicAddress = electronicAddress;
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
		Aggregation other = (Aggregation) obj;
		if (this.address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!this.address.equals(other.address)) {
			return false;
		}
		if (this.electronicAddress == null) {
			if (other.electronicAddress != null) {
				return false;
			}
		} else if (!this.electronicAddress.equals(other.electronicAddress)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		return true;
	}

	public Address getAddress() {
		return this.address;
	}

	public ElectronicAddress getElectronicAddress() {
		return this.electronicAddress;
	}

	public Name getName() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.address == null) ? 0 : this.address.hashCode());
		result = prime
				* result
				+ ((this.electronicAddress == null) ? 0
						: this.electronicAddress.hashCode());
		result = prime * result
				+ ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "JComposition [name=" + this.name + ", address=" + this.address
				+ ", electronicAddress=" + this.electronicAddress + "]";
	}

}
