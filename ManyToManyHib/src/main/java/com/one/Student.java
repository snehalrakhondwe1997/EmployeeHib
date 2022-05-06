package com.one;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
	@ManyToMany(mappedBy="sd")
	private List<Laptop> lt = new ArrayList<Laptop>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<Laptop> getLt() {
		return lt;
	}
	public void setLt(List<Laptop> lt) {
		this.lt = lt;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", lt=" + lt + "]";
	}
		
}
