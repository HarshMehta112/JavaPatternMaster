package org.example.InterfaceSegregationPrinciple.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.example.InterfaceSegregationPrinciple.Entity.User;

/**
 * Interface Segregation Principle : Clients should not be forced to depend upon interfaces that they do not use.
 * Interface Pollution : Sign of Interface Pollution:
 * 1. Classes have empty method implementations
 * 2. Method implementations throw UnsupportedOperationException or similar
 * 3. Method implementations return null or default/dummy values.
 * */


//Stores User entities
public class UserPersistenceService implements PersistenceService<User>{
	
	private static final Map<Long, User> USERS = new HashMap<>();
	
	@Override
	public void save(User entity) {
		synchronized (USERS) {
			USERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(User entity) {
		synchronized (USERS) {
			USERS.remove(entity.getId());
		}
	}

	@Override
	public User findById(Long id) {
		synchronized (USERS) {
			return USERS.get(id);
		}
	}

	/**
	 * Here this method findByName is only for User services not applicable to the order servuces.
	 * So we can not defined in the Persistence interface because this method is only for one class if we defined
	 * then except this all class violates the interface segregation principle.
	 * */
	
	public List<User> findByName(String name) {
		synchronized (USERS) {
			return USERS.values().stream().filter(u->u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}
	}

}
