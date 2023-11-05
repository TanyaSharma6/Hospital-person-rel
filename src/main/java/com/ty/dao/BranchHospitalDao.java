package com.ty.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Branch;
import com.ty.dto.Hospital;

public class BranchHospitalDao {

	public void saveData(Hospital hospital) {
			
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eb8");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		
		
	}
}
