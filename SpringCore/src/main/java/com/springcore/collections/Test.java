package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection.xml");
Emp ep = (Emp) context.getBean("Emp1");
System.out.println(ep);
System.out.println(ep.getName());
System.out.println(ep.getAddresses());
System.out.println(ep.getCourses());
System.out.println(ep.getPhones().getClass().getName());

	}

}
