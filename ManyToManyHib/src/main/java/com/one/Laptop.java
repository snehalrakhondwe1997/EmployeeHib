package com.one;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Student> sd = new ArrayList<Student>();
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Student> getSd() {
		return sd;
	}
	public void setSd(List<Student> sd) {
		this.sd = sd;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", sd=" + sd + "]";
	}
		
	
}
