package com.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technical_courses")
public class MyCourses {
	@Id
	@Column(name="course_id")
	private int id;
	private String name;
	private CourseTeacher tname;
	@Column(name="course_price")
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CourseTeacher getTname() {
		return tname;
	}
	public void setTname(CourseTeacher tname) {
		this.tname = tname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "MyCourses[id = " +id + ", name = " +name + ", price = " +price +"]";
	}
}
