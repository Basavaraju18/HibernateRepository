package com.OnetoMany.Loading.OneToMany;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int c_id;
	private String c_name;
	
	@OneToMany(mappedBy="cus",fetch=FetchType.EAGER)
	private List<Product> pList=new ArrayList<Product>();
	public List<Product> getpList() {
		return pList;
	}
	public void setpList(List<Product> pList) {
		this.pList = pList;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name  + "]";
	}
		
	

}
