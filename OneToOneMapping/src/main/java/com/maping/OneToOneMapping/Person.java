package com.maping.OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
//alt + shift + o    id name contact  id name
public class Person {
	
	@Id
	private int pid;
	private String pname;
	private long pcontact;
	
	@OneToOne
	private UniqueAuthority uidai;
	
	
	public UniqueAuthority getUidai() {
		return uidai;
	}
	
	public void setUidai(UniqueAuthority uidai) {
		this.uidai = uidai;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return pname;
	}
	public void setName(String pname) {
		this.pname = pname;
	}
	public long getPcontact() {
		return pcontact;
	}
	public void setPcontact(long pcontact) {
		this.pcontact = pcontact;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + pname + ", pcontact=" + pcontact + ", uidai=" + uidai + "]";
	}

}
