package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prescribedBy;
	private int duration;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Medicines> medicines;
	
	
	
	public List<Medicines> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<Medicines> medicines) {
		this.medicines = medicines;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrescribedBy() {
		return prescribedBy;
	}
	public void setPrescribedBy(String prescribedBy) {
		this.prescribedBy = prescribedBy;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", prescribedBy=" + prescribedBy + ", duration=" + duration + "]";
	}
	
}
