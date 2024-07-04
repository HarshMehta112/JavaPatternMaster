package org.example.DependencyInversionPrinciple;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file

	/**
	 * Here we can see MessagePrinter have 2 dependencies 1. PrintWriter 2. JSONFormattor.
	 * Now I want to print this message in console then it is not going to work, we have to change the method.
	 * If we want to change the format of the message then again we have to chnge the method.
	 *
	 * Here dependency inversion principle comes into the picture
	 * where dependency should be depend on the abstraction.
	 * */
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException {
//		Formatter formatter = new JSONFormatter();//creates formatter
//		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))) { //creates print writer

			writer.println(formatter.format(msg)); //formats and writes message
			writer.flush();
	}
}
