package com.LevelOnetoMany.Level1OnetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Food {
	@Id
	private int fId;
	private String fName;
	
	@ManyToOne
	private Restaurent res;

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
	public Restaurent getRes() {
		return res;
	}
	public void setRes(Restaurent res) {
		this.res = res;
	}
	@Override
	public String toString() {
		return "Food [fId=" + fId + ", fName=" + fName + ", res=" + res + "]";
	}
	
}
