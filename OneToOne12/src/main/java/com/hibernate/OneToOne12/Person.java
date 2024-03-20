package com.hibernate.OneToOne12;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//import javax.persistence.Table;

@Entity
	
	public class Person {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	    private PhoneNumber phoneNumber;

		public Long getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public PhoneNumber getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(PhoneNumber phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


	}


