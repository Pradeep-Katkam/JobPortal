package com.alpha.JobPortal.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int NoOfYear;
	private String role;
	private String ComapanyName;
	private String StartDate;
	private String EndDate;
	private String working;
	private String description;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Skill> skills;
	public Experience() {
		super();
	}
	public Experience(int noOfYear, String role, String comapanyName, String startDate, String endDate, String working,
			String description, List<Skill> skills) {
		super();
		NoOfYear = noOfYear;
		this.role = role;
		ComapanyName = comapanyName;
		StartDate = startDate;
		EndDate = endDate;
		this.working = working;
		this.description = description;
		this.skills = skills;
	}
	public int getNoOfYear() {
		return NoOfYear;
	}
	public void setNoOfYear(int noOfYear) {
		NoOfYear = noOfYear;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getComapanyName() {
		return ComapanyName;
	}
	public void setComapanyName(String comapanyName) {
		ComapanyName = comapanyName;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getWorking() {
		return working;
	}
	public void setWorking(String working) {
		this.working = working;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	
	
}
