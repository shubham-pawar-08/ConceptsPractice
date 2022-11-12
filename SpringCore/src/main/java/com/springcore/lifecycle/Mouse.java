package com.springcore.lifecycle;

import java.util.spi.AbstractResourceBundleProvider;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mouse {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Mouse(double price) {
	super();
	this.price = price;
}

public Mouse() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Mouse [price=" + price + "]";
}
@PostConstruct
public void start() {
	System.out.println("Started");
}
@PreDestroy
public void end() {
	System.out.println("Ended");
}


}
