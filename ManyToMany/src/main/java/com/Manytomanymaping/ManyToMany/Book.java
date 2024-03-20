package com.Manytomanymaping.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	private String bname;
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
//	private List<Student> Student;

}
