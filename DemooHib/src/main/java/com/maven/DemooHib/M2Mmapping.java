package com.maven.DemooHib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class M2Mmapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf = cfg.buildSessionFactory();

EmpM2M e1 = new EmpM2M();
EmpM2M e2 = new EmpM2M();
e1.setEmp_id(1);
e1.setNameString("Shubham");

e2.setEmp_id(2);
e2.setNameString("Dinesh");

ProjectM2M p1 = new ProjectM2M();
ProjectM2M p2 = new ProjectM2M();
p1.setP_id(12);
p1.setP_name("Money Mangement");
p2.setP_id(13);
p2.setP_name("Time Mangement");

List<EmpM2M> e_list = new ArrayList<EmpM2M>();
List<ProjectM2M> p_list = new ArrayList<ProjectM2M>();
e_list.add(e1);
e_list.add(e2);

p_list.add(p1);
p_list.add(p2);

//e1.setProjects(p_list);
//p2.setEmps(e_list);
p1.setEmps(e_list);
//e2.setProjects(p_list);


Session s = sf.openSession();
Transaction tx = s.beginTransaction();
s.save(e1);
s.save(e2);
s.save(p1);
s.save(p2);

tx.commit();
s.close();

sf.close();

	}

}
