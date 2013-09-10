package org.naderica.whyscala.singleton.java;

/**
 * Denotes a singleton machine that can either print or scan at a time.
 * 
 *
 */
public class ManualMachine {

	private final static Printer printer = new Printer("A4", true);
	private final static Scanner scanner = new Scanner();

	public static void print(final String message) {
		printer.print(message);
	}

	public static void process(final String document) {
		scanner.process(document);
	}

	public static void main(String[] args) {
		ManualMachine.print("Scanner my book using scanner as a separate operation");
		ManualMachine.process("Scanner my book using scanner as a separate operation");
	}
}
