package com.ty.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dao.NewDao;
import com.ty.dto.Address;
import com.ty.dto.Branch;
import com.ty.dto.Encounter;
import com.ty.dto.Prescription;

public class EncounterBranchController {
	public static void main(String[] args) {
		NewDao dao= new NewDao();
		
	Branch branch1 = new Branch();
	branch1.setBranchName("Jaynagar");
	
	
	Branch branch2 = new Branch();
	branch1.setBranchName("Banshankari");
	
		
		List<Branch> branchList = Arrays.asList(branch1,branch2);
		
		Encounter encounter = new Encounter();
		encounter.setCauseofadmit("Liver infection");
		encounter.setAdmitDate("12-09-2022");
		encounter.setBranch(branchList);
		
		
		dao.saveData(encounter);
		
		
		System.out.println("Data Saved");
	}
}
