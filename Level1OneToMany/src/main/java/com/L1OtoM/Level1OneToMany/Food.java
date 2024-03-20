package com.L1OtoM.Level1OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {
	
	@Id
	private int fId;
	private String fName;
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	@Override
	public String toString() {
		return "Food [fId=" + fId + ", fName=" + fName + "]";
	}
		
}
