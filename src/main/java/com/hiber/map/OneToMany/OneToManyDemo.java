package com.hiber.map.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestionId(1001);
		q1.setQuestion("What is Java");
		
		Question q2 = new Question();
		q2.setQuestionId(1002);
		q2.setQuestion("What is Eclipse");

		Answer ans1 = new Answer();
		ans1.setAnswerId(1111);
		ans1.setAnswer("Java is programming language");

		Answer ans2 = new Answer();
		ans2.setAnswerId(2222);
		ans2.setAnswer("Java is Robust language");
		
		Answer ans3 = new Answer();
		ans3.setAnswerId(3333);
		ans3.setAnswer("Eclipse is IDE");

		Answer ans4 = new Answer();
		ans4.setAnswerId(4444);
		ans4.setAnswer("It is very good IDE");

		List<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
		List<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		q1.setAnswer(list1);
		q2.setAnswer(list2);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(q1);
		s.save(q2);
		
		Question qst1 = s.get(Question.class, 1001);
		System.out.println(qst1.getQuestionId());
		System.out.println(qst1.getQuestion());
		for (Answer a : qst1.getAnswer()) {
			System.out.println(a.getAnswer()); 
		}
		
		//		Question q = (Question) s.get(Question.class, 1001);
//		System.out.println(q.getQuestionId()+":"+q.getQuestion()+":"+q.getAnswer().getAnswer());

		tx.commit();
		s.close();
		factory.close();
	}
}
