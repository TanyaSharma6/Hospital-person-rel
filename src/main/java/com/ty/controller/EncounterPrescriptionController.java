package com.ty.controller;

import java.util.Arrays;
import java.util.List;

import com.ty.dao.NewDao;
import com.ty.dao.PersonDao;
import com.ty.dto.Encounter;
import com.ty.dto.Person;
import com.ty.dto.Prescription;

public class EncounterPrescriptionController {

	public static void main(String[] args) {
		NewDao dao= new NewDao();
		
		Prescription p1= new Prescription();
		p1.setPrescribedBy("Dr. Sobha");
		p1.setDuration(3);
		
		Prescription p2= new Prescription();
		p2.setPrescribedBy("Dr. Mittal");
		p2.setDuration(2);
		
		List<Prescription> prescriptionList = Arrays.asList(p1,p2);
		
		
		Encounter newencounter= new Encounter();
		newencounter.setPrescription(prescriptionList);
		
		
		
		dao.saveData(newencounter);
		
		
		System.out.println("Data Saved");
	}

}
