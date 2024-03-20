package com.L1OtoM.Level1OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	
	@Id
	private int rId;
	private String rName;
	
	@OneToMany
	private List<Food> fList=new ArrayList<Food>();

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public List<Food> getfList() {
		return fList;
	}

	public void setfList(List<Food> fList) {
		this.fList = fList;
	}

	@Override
	public String toString() {
		return "Restaurant [rId=" + rId + ", rName=" + rName + ", fList=" + fList + "]";
	}

}
