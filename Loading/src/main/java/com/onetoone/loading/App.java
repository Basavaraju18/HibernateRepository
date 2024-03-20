package com.onetoone.loading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		
	
	Product p1=new Product();
	p1.setId(1);
	p1.setpName("phone");
	p1.setPrice(100.0);
	
	Customer c=new Customer();
	c.setC_id(101);
	c.setC_name("Arun");
	c.setPr(p1);
	
	 Configuration cfg= new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Customer.class);
 	SessionFactory sf=cfg.buildSessionFactory();
 	Session session = sf.openSession();
 	Transaction transaction=session.beginTransaction();
 	session.get(Customer.class, 101);
 	
 	session.save(p1);
 	session.save(c);
 	transaction.commit();

	
	
	
	}

}
