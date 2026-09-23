package com.alpha.JobPortal.dto;

import java.util.List;

import com.alpha.JobPortal.entity.Skill;

public class CreateNewJobDto {
	private int compIdTosetcom;
	private String role;
	private List<Skill> skill;
	private String jobDesc;
	private int noOfPostion;
	private int salary;
	private int bond;
	private int experience;
	private String lastdatetoApply;
	private String redQualifcation;
	public CreateNewJobDto() {
		super();
	}
	public CreateNewJobDto(int compIdTosetcom, String role, List<Skill> skill, String jobDesc, int noOfPostion,
			int salary, int bond, int experience, String lastdatetoApply, String redQualifcation) {
		super();
		this.compIdTosetcom = compIdTosetcom;
		this.role = role;
		this.skill = skill;
		this.jobDesc = jobDesc;
		this.noOfPostion = noOfPostion;
		this.salary = salary;
		this.bond = bond;
		this.experience = experience;
		this.lastdatetoApply = lastdatetoApply;
		this.redQualifcation = redQualifcation;
	}
	public int getCompIdTosetcom() {
		return compIdTosetcom;
	}
	public void setCompIdTosetcom(int compIdTosetcom) {
		this.compIdTosetcom = compIdTosetcom;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public int getNoOfPostion() {
		return noOfPostion;
	}
	public void setNoOfPostion(int noOfPostion) {
		this.noOfPostion = noOfPostion;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBond() {
		return bond;
	}
	public void setBond(int bond) {
		this.bond = bond;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getLastdatetoApply() {
		return lastdatetoApply;
	}
	public void setLastdatetoApply(String lastdatetoApply) {
		this.lastdatetoApply = lastdatetoApply;
	}
	public String getRedQualifcation() {
		return redQualifcation;
	}
	public void setRedQualifcation(String redQualifcation) {
		this.redQualifcation = redQualifcation;
	}
	
	
}
