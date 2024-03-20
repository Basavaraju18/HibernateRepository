package com.hibarnate.test.Hibarnate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee2_details2")

public class Employee {
	@Id
	private int id;
	private String name;
	private String sal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}
