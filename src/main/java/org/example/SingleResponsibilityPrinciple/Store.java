package org.example.SingleResponsibilityPrinciple;

import java.util.HashMap;
import java.util.Map;

//Stores data in memory
public class Store {
	
    private static final Map<String, User> USERS = new HashMap<>();
    //Adds user to in memory hash map
    public void store(User user)
    {
        synchronized(USERS)
        {
            USERS.put(user.getName(), user);
        }
    }
    //Returns used with given id if present in map else null
    public User getUser(String name)
    {
        synchronized(USERS)
        {
            return USERS.get(name);
        }
    }
}