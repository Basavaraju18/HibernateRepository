package com.onetomanymaping.OneToManyMaping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int pId;
	private String pName;
	private long pContact;
	
	@OneToMany(mappedBy ="pw")
	private List<Vehicle> vl= new ArrayList<Vehicle>();
	
	public List<Vehicle> getVl() {
		return vl;
	}
	public void setVl(List<Vehicle> vl) {
		this.vl = vl;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getpContact() {
		return pContact;
	}
	public void setpContact(long pContact) {
		this.pContact = pContact;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pContact=" + pContact + "]";
	}
	
	

}
