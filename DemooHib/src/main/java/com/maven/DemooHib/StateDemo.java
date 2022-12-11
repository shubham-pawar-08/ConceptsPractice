package com.maven.DemooHib;
import com.maven.DemooHib.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Creating object
		//Transient State
		Student student = new Student();
		student.setId(12);
		student.setName("New_Boy");
		student.setCity("Ithech");
		Student student1 = new Student();
		student1.setId(13);
		student1.setName("Old_Boy");
		student1.setCity("Ithech");
	
		//Persistent state - session and database
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction(); //TO check changes in databases and physically change
		session.save(student);
		session.save(student1);
	
		
		
		student.setName("Chal_hutt");
		student1.setCity("Tithech");
	
	tx.commit();
	session.close();
	// Detached state
	student.setName("Hahaha");
	
		sf.close();
		
	}

}
