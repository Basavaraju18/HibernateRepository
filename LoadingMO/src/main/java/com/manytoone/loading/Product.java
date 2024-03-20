package com.manytoone.loading;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Product {
	@Id
	private int id;
	private String pName;
	private double price;
	@ManyToOne(fetch=FetchType.LAZY)
	private Customer cus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", price=" + price+ "]";
	}

}
