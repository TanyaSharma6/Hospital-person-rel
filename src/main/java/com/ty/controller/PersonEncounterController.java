package com.ty.controller;

import java.util.Arrays;
import java.util.List;

import com.ty.dao.PersonDao;
import com.ty.dto.Encounter;
import com.ty.dto.Person;
import com.ty.dto.Prescription;

public class PersonEncounterController {

	public static void main(String[] args) {
		PersonDao dao= new PersonDao();
		
			
		Encounter encounter1 = new Encounter();
		encounter1.setCauseofadmit("Brain Tumor");
		encounter1.setAdmitDate("19-10-2022");
	
		
		Encounter encounter2 = new Encounter();
		encounter2.setCauseofadmit("kidney stone");
		encounter2.setAdmitDate("04-05-2022");
		
		Encounter encounter3 = new Encounter();
		encounter3.setCauseofadmit("Abdomin Pain");
		encounter3.setAdmitDate("11-08-2022");
		
		List<Encounter> encounterlist= Arrays.asList(encounter1,encounter2,encounter3);
		
		Person person = new Person();
		person.setPersonName("Suraj");
		person.setAge(27);
		person.setEncounter(encounterlist);
		
		dao.saveData(person);
		System.out.println("Data Saved");
	}
}
