package com.edu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="eduStudent")
public class EduStudent {
	@Id
	@Column(name="id")
	private int sid;
	@Column(name="name")
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return sname;
	}
	public void setName(String sname) {
		this.sname = sname;
	}
	public String toString() {
		return "Student[id = " +sid + " name = " +sname + "]";
	}
}
