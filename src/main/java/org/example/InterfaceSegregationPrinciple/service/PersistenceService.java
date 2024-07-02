package org.example.InterfaceSegregationPrinciple.service;


import org.example.InterfaceSegregationPrinciple.Entity.Entity;

//common interface to be implemented by all persistence services.
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
}
