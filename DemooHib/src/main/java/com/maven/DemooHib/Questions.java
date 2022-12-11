package com.maven.DemooHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Questions {
	@Id
private int QID;
	
private String question;
@OneToOne
	private Answers ansID;
	
public Questions(int qID, String question) {
		super();
		QID = qID;
		this.question = question;
	}
public Questions() {
	super();
}
public Answers getAnsID() {
	return ansID;
}
public void setAnsID(Answers ansID) {
	this.ansID = ansID;
}
public Questions(Answers ansID) {
	super();
	this.ansID = ansID;
}
public int getQID() {
	return QID;
}
public void setQID(int qID) {
	QID = qID;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}

}
