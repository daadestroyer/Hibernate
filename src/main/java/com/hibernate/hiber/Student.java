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
	private Certificate cerit;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, Certificate cerit) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.cerit = cerit;
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

	public Certificate getCerit() {
		return cerit;
	}

	public void setCerit(Certificate cerit) {
		this.cerit = cerit;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", cerit=" + cerit + "]";
	}

}
