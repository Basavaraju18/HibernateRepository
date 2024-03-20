package com.employee.Employee;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String pname;
	@ManyToMany(mappedBy="plist")
	private List<Employee> elist;
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public void setName(String pname) {
		this.pname=pname;
	}
	public String getPname() {
		return pname;

	}
}