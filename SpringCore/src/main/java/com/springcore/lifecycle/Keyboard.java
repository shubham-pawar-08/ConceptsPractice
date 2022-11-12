package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Keyboard implements InitializingBean, DisposableBean {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Keyboard(double price) {
	super();
	this.price = price;
}

public Keyboard() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Keyboard [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Lai mehenga");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroyyyyyyy");
}


}
