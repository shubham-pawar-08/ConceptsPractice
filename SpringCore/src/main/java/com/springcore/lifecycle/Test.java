package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lc.xml");
context.registerShutdownHook();

Laptop hh = (Laptop) context.getBean("lt");
System.out.println(hh);
//registers shut down that is calls destroy method


Keyboard key = (Keyboard) context.getBean("kb");
System.out.println(key);

Mouse mouse = (Mouse) context.getBean("mo");
System.out.println(mouse);
	}

}
