package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Person;

public class PersonDao {

	public void saveData(Person person) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eb8");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
}
}
