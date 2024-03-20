package com.hibarnate.test.Product;

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
    	
        Configuration cfg= new Configuration().configure().addAnnotatedClass(Product.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	Product p =session.get(Product.class, 11);
    	
    	transaction.commit();
 
    }
}
