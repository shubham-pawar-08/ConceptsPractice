package com.maven.DemooHib;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class EmpM2M {
	@Id
private int emp_id;
private String nameString;
@ManyToMany
@JoinTable(name="BOth_work", joinColumns = {@JoinColumn(name="EMP_ID")}, inverseJoinColumns = {@JoinColumn(name="P_ID")})
private List<ProjectM2M> projects;
public EmpM2M() {
	super();
	// TODO Auto-generated constructor stub
}
public EmpM2M(int emp_id, String nameString, List<ProjectM2M> projects) {
	super();
	this.emp_id = emp_id;
	this.nameString = nameString;
	this.projects = projects;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getNameString() {
	return nameString;
}
public void setNameString(String nameString) {
	this.nameString = nameString;
}
public List<ProjectM2M> getProjects() {
	return projects;
}
public void setProjects(List<ProjectM2M> projects) {
	this.projects = projects;
}

}
