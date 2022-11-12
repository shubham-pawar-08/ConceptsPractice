package com.springcore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/CI/ci.xml");
Person pw =(Person) context.getBean("per");
System.out.println(pw);
Addtion add =(Addtion) context.getBean("add");
add.doSum();

	}

}
