package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref.xml");
A a1 = (A)context.getBean("aref");
System.out.println(a1);
System.out.println(a1.getX());
System.out.println(a1.getOb());
System.out.println(a1.getOb().getY());
	}

}
