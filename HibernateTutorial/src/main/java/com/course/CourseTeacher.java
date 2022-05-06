package com.course;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CourseTeacher {
	@Column(name="Teacher_First_Name")
	private String fname;
	@Column(name="Teacher_Last_Name")
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
