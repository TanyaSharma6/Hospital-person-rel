//package com.ty.controller;
//
//import java.util.Arrays;
//import java.util.List;
//
//import com.ty.dao.BranchHospitalDao;
//import com.ty.dto.Branch;
//import com.ty.dto.Hospital;
//
//public class BranchHospitalController {
//
//	public static void main(String[] args) {
//		BranchHospitalDao dao= new BranchHospitalDao();
//		
//		
//		Branch b1= new Branch();
//		b1.setBranchName("Jaynagar");
//		
//		Branch b2= new Branch();
//		b2.setBranchName("Banshankari");
//		
//		List<Branch> branchList = Arrays.asList(b1,b2);
//		
//		Hospital hospital = new Hospital();
//		hospital.setName("Central S Hospital");
//		hospital.setBranches(branchList);
//		
//		dao.saveData(hospital);
//		System.out.println("Data Saved");
//	}
//}
