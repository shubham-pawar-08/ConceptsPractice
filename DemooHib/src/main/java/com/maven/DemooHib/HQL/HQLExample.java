package com.maven.DemooHib.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.maven.DemooHib.Student;

public class HQLExample {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session s = sf.openSession();
	
	//HQL syntax
	String query ="from Student";
	String query1="from Student where city='Ithech'";
	String query2="from Student where city=:x";
	//alias
	String query3="from Student as s where city=:x and s.name=:n";
	
	Query q = s.createQuery(query3);
	q.setParameter("x", "Ithech");
	q.setParameter("n", "Chal_hutt");
//single result - unique
	// multiple - list
	List<Student> list = q.list();
	
	for(Student st:list) {
		System.out.println(st.getName());
	}
	
	System.out.println("______________________");
	
	Transaction tx = s.beginTransaction();
	//delete query
//	Query q1 = s.createQuery("delete from Student as s where s.city=:c");
//	q1.setParameter("c", "Ithech");
//int r = q1.executeUpdate();
//System.out.println("Deleted");
//System.out.println(r);
	//update query
	Query q2  =s.createQuery("update Student set city=:c where name=:n");
	q2.setParameter("c", "Kuthe");
	q2.setParameter("n", "Chal_hutt");
	int r1 =q2.executeUpdate();
	System.out.println(r1);
	tx.commit();
	//How to execute join query
	Query q3  =s.createQuery("select q.question, q.QID, a.answer from Questions2OneToMany as q INNER JOIN q.answers2 as a");
	List<Object[]> list3 = q3.getResultList();
	for(Object[] arr : list3) {
		System.out.println(Arrays.toString(arr));
	}
	
	s.close();
	sf.close();
}
}
