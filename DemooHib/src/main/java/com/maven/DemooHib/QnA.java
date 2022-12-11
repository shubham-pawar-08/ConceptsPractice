package com.maven.DemooHib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QnA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Questions ques = new Questions();
//ques.setQID(11);
//ques.setQuestion("What is hibernate?");
//
//Answers answers = new Answers();
//answers.setAnsID(88);
//answers.setAnswer("It is a ORM Tool");
//ques.setAnsID(answers);
//answers.setQuestions(ques);

Questions2OneToMany ques2 = new Questions2OneToMany();
ques2.setQID(12);
ques2.setQuestion("What is hibernate?");

Answers2OneToMany answers2 = new Answers2OneToMany();
answers2.setAnsID(89);
answers2.setAnswer("It is a ORM Tool");
answers2.setQuestions(ques2);

Answers2OneToMany answers3 = new Answers2OneToMany();
answers3.setAnsID(88);
answers3.setAnswer("It is a ORM Tool and great help to create it");
answers3.setQuestions(ques2);


Answers2OneToMany answers4 = new Answers2OneToMany();
answers4.setAnsID(83);
answers4.setAnswer("It is a ORM Tool and great help to create it easily also");
answers4.setQuestions(ques2);

List<Answers2OneToMany> list = new ArrayList<Answers2OneToMany>();
list.add(answers2);
list.add(answers3);
list.add(answers4);
ques2.setAnswers2(list);

Configuration con = new Configuration().configure("hibernate.cfg.xml");
SessionFactory sF = con.buildSessionFactory();
Session session = sF.openSession();

Transaction tx = session.beginTransaction();
//session.save(ques);
// session.save(answers);
session.save(ques2);
 session.save(answers2);
 session.save(answers3);
 session.save(answers4);

//Questions2OneToMany q = (Questions2OneToMany)session.get(Questions2OneToMany.class, 12);
//System.out.println(q.getQID());
//System.out.println(q.getQuestion());
//System.out.println(q.getAnswers2().size());
//for(Answers2OneToMany a:q.getAnswers2()) {
//	System.out.println(a.getAnswer());
//}


tx.commit();
//fetching
//Questions newQ = (Questions)session.get(Questions.class, 11);
//System.out.println(newQ.getQuestion());
//System.out.println(newQ.getAnsID().getAnswer());
session.close();
	}

}
