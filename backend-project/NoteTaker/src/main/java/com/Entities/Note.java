package com.Entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class Note {
	@Id
private int id;
private String Title;
@Column(length = 1500)
private String Content;
private Date AddedDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getContent() {
	return Content;
}
public void setContent(String content) {
	Content = content;
}
public Date getAddedDate() {
	return AddedDate;
}
public void setAddedDate(Date addedDate) {
	AddedDate = addedDate;
}
public Note(String title, String content, Date addedDate) {
	super();
	this.id = new Random().nextInt(1000);
	this.Title = title;
	this.Content = content;
	this.AddedDate = addedDate;
}
public Note() {
	super();
	// TODO Auto-generated constructor stub
}
}
