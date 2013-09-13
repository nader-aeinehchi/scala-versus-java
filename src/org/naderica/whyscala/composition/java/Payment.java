package org.naderica.whyscala.composition.java;

public class Payment {
	
	/**
	 * Get paid with a certain amount
	 * @param amount
	 */
	public void getPaid(final String amount) {
		System.out.println("Paying the bill for the amount " + amount);
	}
}
