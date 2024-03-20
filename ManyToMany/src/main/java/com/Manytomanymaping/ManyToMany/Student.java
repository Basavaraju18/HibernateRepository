package com.Manytomanymaping.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	
	private List<Book> bk;
	public int getSid() {
		return sId;
	}
	public void setSid(int sId) {
		this.sId = sId;
	}
	public String getSname() {
		return sName;
	}
	public void setSname(String sname) {
		this.sName = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sId + ", sname=" + sName + "]";
	}
	

}
