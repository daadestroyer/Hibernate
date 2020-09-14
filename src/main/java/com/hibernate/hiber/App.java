package com.hibernate.hiber;

 

import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project Started!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		// System.out.println(factory);
		// System.out.println(factory.isClosed());  // to check session factory is closed or not
		
		/*
		// Creating Student , Address object
		Student st = new Student(103,"shubhanshu","kanpur");
		Address ad = new Address();
		ad.setStreet("govind nagar");
		ad.setCity("kanpur");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(123.123);
		FileInputStream fis = new FileInputStream("src/main/java/passport size photo.jpeg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		*/
		
		// to start session
		Session ssn = factory.openSession(); 
		
		 // start transaction
		ssn.beginTransaction(); // or -> Transaction tx = ssn.beginTransaction();
		
		/*
		// save object into database
		ssn.save(st);
		ssn.save(ad);
		// end transaction
		ssn.getTransaction().commit(); // or -> tx.commit();
		*/
		
		 
		 
		
		 
		
		// close session
		ssn.close();
		factory.close();
		
	}
}
