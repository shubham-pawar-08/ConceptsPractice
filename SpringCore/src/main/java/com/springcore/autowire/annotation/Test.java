package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/aw.xml");

//with this type casting is not required
//Emp emp1 = context.getBean("emp1",Emp.class);
Emp emp2 = context.getBean("emp2",Emp.class);
Emp emp3 = context.getBean("emp3",Emp.class);

//System.out.println(emp1);
System.out.println(emp2);
//System.out.println(emp3);

	}

}
