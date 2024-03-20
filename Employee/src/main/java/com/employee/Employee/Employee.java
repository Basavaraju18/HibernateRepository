package com.employee.Employee;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	@ManyToMany
	private List<Project> plist;
	public List<Project> getPlist() {
		return plist;
	}
	public void setPlist(List<Project> plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}
