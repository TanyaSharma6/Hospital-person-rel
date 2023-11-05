package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Person;
import com.ty.dto.Prescription;

public class PrescriptionDao {

public void saveData(Prescription prescription) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eb8");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		
		entityTransaction.begin();
		entityManager.persist(prescription);
		entityTransaction.commit();
		
}
}
