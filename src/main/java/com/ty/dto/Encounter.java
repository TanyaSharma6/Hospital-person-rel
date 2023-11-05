package com.ty.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String causeofadmit;
	private String admitDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Branch> branch;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Prescription> prescription;
	
	
	public String getAdmitDate() {
		return admitDate;
	}
	public void setAdmitDate(String string) {
		this.admitDate = string;
	}
	public List<Branch> getBranch() {
		return branch;
	}
	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCauseofadmit() {
		return causeofadmit;
	}
	public void setCauseofadmit(String causeofadmit) {
		this.causeofadmit = causeofadmit;
	}
	
	public List<Prescription> getPrescription() {
		return prescription;
	}
	public void setPrescription(List<Prescription> prescription) {
		this.prescription = prescription;
	}
	@Override
	public String toString() {
		return "Encounter [id=" + id + ", causeofadmit=" + causeofadmit + ", admitDate=" + admitDate + "]";
	}
	
	
	
	
	 

}
