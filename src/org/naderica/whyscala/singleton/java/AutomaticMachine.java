package org.naderica.whyscala.singleton.java;

/**
 * Denotes a singleton machine that first scan and then prints.
 * 
 * @author nader
 * 
 */
public class AutomaticMachine {

	private final static Printer printer = new Printer("A4", true);
	private final static Scanner scanner = new Scanner();

	public static void process(final String document) {
		scanner.process(document);
		printer.print(document);
	}

	public static void main(String[] args) {

		AutomaticMachine
				.process("Printing and scanning my book using comboMachine as a combo operation");
	}
}
