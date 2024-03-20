package com.OnetoMany.Loading.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customer c1=new Customer();
		c1.setC_id(1);
		c1.setC_name("Bas");
		
		
		Product p1=new Product ();
		p1.setId(101);
		p1.setpName("Shirt");
		p1.setPrice(1222);
	
		Product p2=new Product ();
		p1.setId(102);
		p1.setpName("Pant");
		p1.setPrice(500);
		
		List<Product> l1=new ArrayList<Product>();
		l1.add(p1);
		l1.add(p1);
		c1.setpList(l1);
		
		
		 Configuration cfg= new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Customer.class);
		 	SessionFactory sf=cfg.buildSessionFactory();
		 	Session session = sf.openSession();
		 	Transaction transaction=session.beginTransaction();
		 	session.get(Customer.class, 102);
		 	
		 	session.save(p1);
		 	session.save(p2);
		 	session.save(c1);
		 	transaction.commit();
	}	
}
