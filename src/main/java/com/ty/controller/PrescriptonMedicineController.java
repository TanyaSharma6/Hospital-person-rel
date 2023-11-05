package com.ty.controller;

import java.util.Arrays;
import java.util.List;

import com.ty.dao.NewDao;
import com.ty.dao.PrescriptionDao;
import com.ty.dto.Encounter;
import com.ty.dto.Medicines;
import com.ty.dto.Prescription;

public class PrescriptonMedicineController {

	public static void main(String[] args) {
		PrescriptionDao dao= new PrescriptionDao();
		
		Medicines medicine1 = new Medicines();
		medicine1.setMedicineName("Paracetamol");
		
		Medicines medicine2 = new Medicines();
		medicine2.setMedicineName("Aceclofanec");
		
		Medicines medicine3 = new Medicines();
		medicine3.setMedicineName("Paracetamol");
		
		List<Medicines> medicineList = Arrays.asList(medicine1,medicine2,medicine3);
		
		Prescription pre1= new Prescription();
		pre1.setPrescribedBy("dr. surya");
		pre1.setDuration(2);
		pre1.setMedicines(medicineList);
		
		dao.saveData(pre1);
		System.out.println("Data Saved");
}
}
