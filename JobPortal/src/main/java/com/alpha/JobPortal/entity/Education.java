package com.alpha.JobPortal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Qualification;
	private String Specialization;
	private double percentage;
	private String yop;
	private String University;
	public Education() {
		super();
	}
	public Education(String qualification, String specialization, double percentage, String yop, String university) {
		super();
		Qualification = qualification;
		Specialization = specialization;
		this.percentage = percentage;
		this.yop = yop;
		University = university;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public String getUniversity() {
		return University;
	}
	public void setUniversity(String university) {
		University = university;
	}
	
	
}
