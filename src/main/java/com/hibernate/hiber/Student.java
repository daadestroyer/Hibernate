package com.hibernate.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // @Entity(name = student_info ) through this our entity name and database table
		// name is changed
@Table(name = "studenttable")
public class Student {

	@Id
	private int id;
	private String name;
	private String city;

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
