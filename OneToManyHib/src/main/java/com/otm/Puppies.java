package com.otm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Puppies {
	@Id
	private int pid;
	private String pname;
	@ManyToOne
	private Dog dog;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
//	@Override
//	public String toString() {
//		return "Puppies [pid=" + pid + ", pname=" + pname + ", dog=" + dog + "]";
//	}
	
}
