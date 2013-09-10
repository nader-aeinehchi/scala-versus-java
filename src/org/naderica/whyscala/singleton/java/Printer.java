package org.naderica.whyscala.singleton.java;

public class Printer {

	/**
	 * Denotes default printer which is set to "A4" and
	 * Black-and-White".  Note that "default" is a reserved word in Java
	 */
	public final static Printer defaultPrinter = new Printer("A4", false);

	/**
	 * Denotes a second printer for printing large colored pages. Note that you
	 * cannot use "*" as a field name in Java
	 */
	public final static Printer star = new Printer("A3", true);

	/**
	 * Prints using the default printer. Note that we needed to name this method
	 * as "doPrint" as "print" was defined as per-instance method.
	 */
	public final static void doPrint(final String message) {
		defaultPrinter.print(message);
	}

	public static void main(String[] args) {
		Printer printer1 = new Printer("A3", true);
		printer1.print("Printing using an instance");

		Printer.doPrint("Printing using the singleton's default printer");
		Printer.star.print("Printing using the singleton's large printer");
	}

	private final String paperSize;

	private final Boolean colored;

	public Printer(String paperSize, Boolean colored) {
		super();
		this.paperSize = paperSize;
		this.colored = colored;
	}

	public void print(final String message) {
		System.out.println("Printing using PaperSize=" + this.paperSize
				+ " ColorFormat=" + this.colored + " Message=" + message);
	}
}
