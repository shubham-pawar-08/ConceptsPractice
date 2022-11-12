package com.springcore.CI;

public class Addtion {
private int a;
private int b;
public Addtion(int a, int b) {
	this.a=a;
	this.b=b;
	System.out.println("Constructor integer");
}
public Addtion(double a, double b) {
	this.a=(int)a;
	this.b=(int)b;
	System.out.println("Constructor double");
}

public void doSum() {
	System.out.println("Sum is = " + (this.a + this.b));
}

}
