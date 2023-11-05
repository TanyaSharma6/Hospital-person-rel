package com.ty.controller;

import java.util.Arrays;
import java.util.List;

import com.ty.dao.BranchHospitalDao;
import com.ty.dao.NewDao;
import com.ty.dao.PersonDao;
import com.ty.dto.Address;
import com.ty.dto.Branch;
import com.ty.dto.Encounter;
import com.ty.dto.Hospital;

public class BranchAddressController {
	public static void main(String[] args) {
		
		
		
		Address a1= new Address();
		a1.setLocality("1st block");
		
		Branch b1= new Branch();
		b1.setBranchName("Jaynagar");
		b1.setAddress(a1);
		
		Address a2= new Address();
		a2.setLocality("Kathreguppe");
		
		Branch b2= new Branch();
		b2.setBranchName("Banshankari");
		b2.setAddress(a2);
		
		List<Branch> list= Arrays.asList(b1,b2);
		
		Hospital h1= new Hospital();
		h1.setName("Apollo Hospital");
		h1.setBranches(list);
		
		
		NewDao newdao= new NewDao();
		
//
//					
//			Encounter encounter = new Encounter();
//			encounter.setCauseofadmit("Liver infection");
//			encounter.setAdmitDate("12-09-2022");
//			encounter.setBranch(list);
//			
//			
//			newdao.saveData(encounter);
//			
			
//			System.out.println("Data Saved");
		
		
		
		BranchHospitalDao dao= new BranchHospitalDao();
		dao.saveData(h1);
		
		System.out.println("Data Saved");
		
		
		
		
		
		
		
	}
}
