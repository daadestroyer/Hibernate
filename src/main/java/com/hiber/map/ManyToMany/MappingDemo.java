package com.hiber.map.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo { 
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ssn = factory.openSession();

		Emp e1 = new Emp();
		Emp e2 = new Emp();
		e1.setEid(101);
		e1.setEname("shubham");
		e2.setEid(102);
		e2.setEname("sakshi");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(1);
		p1.setPname("Ecommerce");
		p2.setPid(2);
		p2.setPname("Chatbot");

		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();

		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);

		e1.setProject(list2);
		p1.setEmp(list1);
		

		ssn.beginTransaction();

		
		ssn.save(e1);
		ssn.save(e2);
		ssn.save(p1);
		ssn.save(p2);
		
		
		ssn.getTransaction().commit();
		ssn.close();
		factory.close();
	}
}
