package com.hibernateJPA.JPASelsct;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int Id;
	private String name;
	private int sal;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	

}
