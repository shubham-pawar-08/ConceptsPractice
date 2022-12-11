package com.maven.DemooHib;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answers2OneToMany {
@Id
	private int AnsID;
private String answer;

@ManyToOne
private Questions2OneToMany questions;


public Questions2OneToMany getQuestions() {
	return questions;
}
public void setQuestions(Questions2OneToMany questions) {
	this.questions = questions;
}
public Answers2OneToMany() {
	super();
}
public Answers2OneToMany(int ansID, String answer) {
	super();
	AnsID = ansID;
	this.answer = answer;
}
public int getAnsID() {
	return AnsID;
}
public void setAnsID(int ansID) {
	AnsID = ansID;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

}
