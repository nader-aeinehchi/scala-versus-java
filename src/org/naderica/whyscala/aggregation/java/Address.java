package org.naderica.whyscala.aggregation.java;

public class Address {

	private final String street;
	private final String city;
	private final String country;

	public String getStreet() {
		return this.street;
	}

	public String getCity() {
		return this.city;
	}

	public String getCountry() {
		return this.country;
	}

	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.city == null) ? 0 : this.city.hashCode());
		result = prime * result
				+ ((this.country == null) ? 0 : this.country.hashCode());
		result = prime * result
				+ ((this.street == null) ? 0 : this.street.hashCode());
		return result;
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
		Address other = (Address) obj;
		if (this.city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!this.city.equals(other.city)) {
			return false;
		}
		if (this.country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!this.country.equals(other.country)) {
			return false;
		}
		if (this.street == null) {
			if (other.street != null) {
				return false;
			}
		} else if (!this.street.equals(other.street)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Address [street=" + this.street + ", city=" + this.city
				+ ", country=" + this.country + "]";
	}

}
