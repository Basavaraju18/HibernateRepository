package com.LevelOnetoMany.Level1OnetoMany;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */

// MANY TO ONE

public class App 
{
    public static void main( String[] args )
    {
    	
//    	Restaurent r1=new Restaurent();
//    	r1.setrId(10);
//    	r1.setrName("KFC");
//    	
//    	Food f1=new Food();
//    	f1.setfId(1);
//    	f1.setfName("Spicymack chicken");
//    	f1.setRes(r1);
//    	
//    	Food f2=new Food();
//    	f2.setfId(2);
//    	f2.setfName("burger chattni");
//    	f2.setRes(r1);
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Restaurent.class).addAnnotatedClass(Food.class);
    	org.hibernate.SessionFactory sf=cfg.buildSessionFactory();
    	Session session1=sf.openSession();
    	Transaction transaction1=session1.beginTransaction();
    	
//    	List ls=new ArrayList();
//    	ls.add(f1);
//    	ls.add(f2);
//    	ls.add(r1);
//    	
//    	for(Object ele:ls) {
//    		session1.save(ele);
//    	}
    	
    	Food food1=session1.get(Food.class, 1);
    	System.out.println(food1);
    	
    	System.out.println("=========CLIENT 02==============");
    	Session session2=sf.openSession();
    	Transaction transaction2=session2.beginTransaction();
    	Food food2=session2.get(Food.class, 2);
    	System.out.println(food2);
    	
    	System.out.println("=========CLIENT 03==============");
    	Session session3=sf.openSession();
    	Transaction transaction3=session3.beginTransaction();
    	Food food3=session3.get(Food.class, 2);
    	System.out.println(food3);
    	
    	
    	transaction1.commit();
    	session1.close();
    	
    	transaction2.commit();
    	session2.close();
    	
    	transaction3.commit();
    	session3.close();
    	
    }
}
