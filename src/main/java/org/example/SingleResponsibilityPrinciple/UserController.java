package org.example.SingleResponsibilityPrinciple;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity

/**
 * Here we can see that there is a violation of Single Responsibility Principle,
 * There should never be more than one reason for a class to change.
 * Here if we want to change validation logic then we have to change this class,
 * if we want to change the storing process of use the also we have to change this class.
 * */


public class UserController {
	//Store used by controller
    
    //Create a new user
    public String createUser(String userJson) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        
        User user = mapper.readValue(userJson, User.class);

        UserValidator validator = new UserValidator();

        boolean isValid = validator.validate(user);

        if(!isValid)
        {
            return "ERROR";
        }

        UserPersistenceService userPersistenceService = new UserPersistenceService();

        userPersistenceService.storeUser(user);

        return "SUCCESS";
    } 
/*
    //Validates the user object
    private boolean isValidUser(User user)
    {
        if(!isPresent(user.getName()))
        {
            return false;
        }
        user.setName(user.getName().trim());

        if(!isValidAlphaNumeric(user.getName()))
        {
            return false;
        }
        if(user.getEmail() == null || user.getEmail().trim().length() == 0)
        {
            return false;
        }
        user.setEmail(user.getEmail().trim());

        return isValidEmail(user.getEmail());
    }
    
    //Simply checks if value is null or empty..
    private boolean isPresent(String value)
    {
        return value != null && value.trim().length() > 0;
    }
    //check string for special characters
    private boolean isValidAlphaNumeric(String value)
    {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");

        Matcher matcher = pattern.matcher(value);

        return !matcher.find();
    }

    //check string for valid email address - this is not for prod.

    private boolean isValidEmail(String value)
    {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher matcher = pattern.matcher(value);

        return matcher.find();
    }*/

}