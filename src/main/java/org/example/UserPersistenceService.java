package org.example;

public class UserPersistenceService
{
    private Store store = new Store();

    public void storeUser(User user)
    {
        store.store(user);
    }

	
}
