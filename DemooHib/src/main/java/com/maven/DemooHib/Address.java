package com.maven.DemooHib;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="student_address")
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "address_id")
	private int addressaid;
@Column(length = 50, name ="STREET")
	private String Street;
@Column(length = 10)
	private String city;
	private boolean isOpen;
	@Transient
	private double x;
	@Column(name = "Added_Date")
	@Temporal(TemporalType.DATE)
	private Date addeDate;
	@Lob
	private byte[] image;
	public Address() {
		super();
	}
	public Address(int addressaid, String street, String city, boolean isOpen, double x, Date addeDate, byte[] image) {
		super();
		this.addressaid = addressaid;
		Street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addeDate = addeDate;
		this.image = image;
	}
	public int getAddressaid() {
		return addressaid;
	}
	public void setAddressaid(int addressaid) {
		this.addressaid = addressaid;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddeDate() {
		return addeDate;
	}
	public void setAddeDate(Date addeDate) {
		this.addeDate = addeDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
}
