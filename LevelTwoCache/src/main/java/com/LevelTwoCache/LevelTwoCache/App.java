package com.LevelTwoCache.LevelTwoCache;

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
    	Product p1=new Product();
    	p1.setpId(1);
    	p1.setpName("Pen");
    	p1.setpPrice(10);
    	
    	Product p2=new Product();
    	p2.setpId(2);
    	p2.setpName("Book");
    	p2.setpPrice(20);
    	
    	Product p3=new Product();
    	p3.setpId(3);
    	p3.setpName("Bag");
    	p3.setpPrice(50);
    	
    	Product p4=new Product();
    	p4.setpId(4);
    	p4.setpName("Phone");
    	p4.setpPrice(60);
    	
    	
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session1=sf.openSession();
    	Transaction transaction1=session1.beginTransaction();
    	
    	List<Product> pList=new ArrayList<Product>();
    	pList.add(p1);
    	pList.add(p2);
    	pList.add(p3);
    	pList.add(p4);
    	
    	for(Product pr: pList) {
    		session1.save(pr);
    		
    		transaction1.commit();
    		session1.close();
    		
    	}
    	
    	
    }
}
