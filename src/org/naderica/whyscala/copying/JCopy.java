package org.naderica.whyscala.copying;

public class JCopy {

	private final String firstName;
	private final String lastName;

	public JCopy(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * 
	 * @param firstName
	 * @return a new instance using <code>firstName</code>
	 */
	public JCopy copyWithFirstName(final String firstName) {
		return new JCopy(firstName, this.lastName);
	}

    /**
     * 
     * @param lastName
     * @return a new instance using <code>lastName</code>
     */
	public JCopy copyWithLastName(final String lastName) {
		return new JCopy(this.firstName, lastName);
	}

    /**
     * 
     * @param firstName
     * @return a new instance using <code>firstName</code>
     */
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public static void main(String[] args) {
		final JCopy scalaInventor = new JCopy("Martin", "Odersky");
		final JCopy hybridInventor = scalaInventor.copyWithFirstName("James");
		final JCopy javaInventor = hybridInventor.copyWithLastName("Gosling");
		
		System.out.println(scalaInventor);
		System.out.println(hybridInventor);
		System.out.println(javaInventor);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.firstName == null) ? 0 : this.firstName.hashCode());
		result = prime * result
				+ ((this.lastName == null) ? 0 : this.lastName.hashCode());
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
		JCopy other = (JCopy) obj;
		if (this.firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!this.firstName.equals(other.firstName)) {
			return false;
		}
		if (this.lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!this.lastName.equals(other.lastName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "JCopy [firstName=" + this.firstName + ", lastName="
				+ this.lastName + "]";
	}

}
