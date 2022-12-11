package com.maven.DemooHib;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Questions2OneToMany {
	@Id
private int QID;
	
private String question;
@OneToMany(mappedBy = "questions", fetch = FetchType.LAZY)
private List<Answers2OneToMany> answers2;

public Questions2OneToMany(int qID, String question) {
		super();
		QID = qID;
		this.question = question;
	}
public Questions2OneToMany() {
	super();
}

public List<Answers2OneToMany> getAnswers2() {
	return answers2;
}
public void setAnswers2(List<Answers2OneToMany> answers2) {
	this.answers2 = answers2;
}

public Questions2OneToMany(int qID, String question, List<Answers2OneToMany> answers2) {
	super();
	QID = qID;
	this.question = question;
	this.answers2 = answers2;
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
