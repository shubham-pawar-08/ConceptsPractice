package com.springcore.CI;



public class Person {
private String Name;
private int p_id;
private Certificate certi;

public Person(String name, int p_id, Certificate certi) {
	super();
	Name = name;
	this.p_id = p_id;
	this.certi = certi;
}

@Override
public String toString() {
	return "Person [Name=" + Name + ", p_id=" + p_id + ", certi=" + certi + "]";
}


}
