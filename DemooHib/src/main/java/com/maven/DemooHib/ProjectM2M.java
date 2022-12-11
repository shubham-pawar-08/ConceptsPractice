package com.maven.DemooHib;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class ProjectM2M {
	@Id
private int p_id;
private String p_name;

@ManyToMany(mappedBy = "projects")

private List<EmpM2M> Emps;
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public List<EmpM2M> getEmps() {
	return Emps;
}
public void setEmps(List<EmpM2M> emps) {
	Emps = emps;
}
public ProjectM2M() {
	super();
	// TODO Auto-generated constructor stub
}
public ProjectM2M(int p_id, String p_name, List<EmpM2M> emps) {
	super();
	this.p_id = p_id;
	this.p_name = p_name;
	Emps = emps;
}
}
