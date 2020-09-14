package com.hibernate.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session ssn = factory.openSession();
		Student st1 = new Student(123,"kshitij","kanpur",new Certificate("Android","2 Months"));
		Student st2 = new Student(124,"yash","kanpur",new Certificate("Java","4 Months"));
		
		ssn.beginTransaction();
		
		ssn.save(st1);
		ssn.save(st2);
		
		ssn.getTransaction().commit();
		ssn.close();
		factory.close();
		
	}
}
