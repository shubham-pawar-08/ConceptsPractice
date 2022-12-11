package com.maven.DemooHib;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answers {
@Id
	private int AnsID;
private String answer;

@OneToOne(mappedBy = "ansID")
private Questions questions;
public Questions getQuestions() {
	return questions;
}
public void setQuestions(Questions questions) {
	this.questions = questions;
}
public Answers() {
	super();
}
public Answers(int ansID, String answer) {
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
