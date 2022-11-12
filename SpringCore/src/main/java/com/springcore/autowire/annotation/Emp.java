package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
private Address address;

public Address getAddress() {
	return address;
}
@Autowired
@Qualifier("address1")
public void setAddress(Address address) {
	this.address = address;
	System.out.println("Setter");
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp(Address address) {
	super();
	this.address = address;
	System.out.println("Constructor");
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

}
