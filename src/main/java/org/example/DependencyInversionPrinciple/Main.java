package org.example.DependencyInversionPrinciple;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Definition :
 * A. High level modules should not depend upon low level modules. Both should depend upon abstractions.
 * B. Abstractions should not depend upon details and details should depend upon abstractions.
 *
 * */



public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("Hello Harsh!");
		MessagePrinter printer = new MessagePrinter();
//		try(PrintWriter writer = new PrintWriter(new FileWriter("HarshTest.txt"))) {
		try(PrintWriter writer = new PrintWriter(System.out)) {
			printer.writeMessage(msg, new JSONFormatter(),writer);
		}
	}

}
