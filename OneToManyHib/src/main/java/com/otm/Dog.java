package com.otm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dog {
	@Id
	private int id;
	private String breed;
	@OneToMany(mappedBy="dog", fetch=FetchType.EAGER)
	private List<Puppies> puppy = new ArrayList<Puppies>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public List<Puppies> getPuppy() {
		return puppy;
	}
	public void setPuppy(List<Puppies> puppy) {
		this.puppy = puppy;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", breed=" + breed + ", puppy=" + puppy + "]";
	}
	
	
}
