package com.nt.proj;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentBean implements Serializable{
	private String rollNo,name,course,email;
	private MarkBean mk;
// Rohit
	public String getRollNo() {
		return rollNo; 
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MarkBean getMk() {
		return mk;
	}

	public void setMk(MarkBean mk) {
		this.mk = mk;
	}

	public StudentBean() {
		super();
		mk=new MarkBean();
	}

	@Override
	public String toString() {
		return "StudentBean [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", email=" + email + ", mk="
				+ mk + "]";
	}
	
	
	

}
