package org.example.SingleResponsibilityPrinciple;

import java.io.IOException;

//Main class to test
public class Main {
	//A valid USER JSON String
	private static final String VALID_USER_JSON = "{\"name\": \"Harsh\", \"email\": \"xyz@email.com\", \"address\":\"Ahd\"}";
	
	//Invalid USER JSON String - email format wrong
	private static final String INVALID_USER_JSON = "{\"name\": \"Mehta\", \"email\": \"abc@email\", \"address\":\"Delhi\"}";
	
	public static void main(String[] args) throws IOException
	{
		UserController controller = new UserController();

		//Check with valid JSON
		String response = controller.createUser(VALID_USER_JSON);

		System.out.println("Valid JSON received response: "+response);

		//Check with invalid JSON
		response = controller.createUser(INVALID_USER_JSON);

		System.out.println("Invalid JSON received response: "+response);
	}

}
