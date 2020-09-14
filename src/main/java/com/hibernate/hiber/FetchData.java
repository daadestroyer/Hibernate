package com.hibernate.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 

public class FetchData {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ssn = factory.openSession();
		
		// get() student of id 102
		Student stu = ssn.get(Student.class, 102);
		System.out.println(stu);
		
		ssn.close();
		factory.close();
		
	}
}