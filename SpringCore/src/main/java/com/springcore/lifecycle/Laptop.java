package com.springcore.lifecycle;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Laptop {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Laptop(double price) {
	super();
	this.price = price;
}

public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Laptop [price=" + price + "]";
}

public void init() {
	System.out.println("In it method");
}
public void destory() {
	System.out.println("Destroyed");
}

}
