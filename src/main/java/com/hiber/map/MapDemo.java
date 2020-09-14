package com.hiber.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestionId(1002);
		q1.setQuestion("What is Netbeans");

		Answer ans = new Answer();
		ans.setAnswerId(2222);
		ans.setAnswer("It is IDE");
		q1.setAnswer(ans);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		System.out.println(q1);
		
		tx.commit(); 
		s.close();
		factory.close();
	}
}
