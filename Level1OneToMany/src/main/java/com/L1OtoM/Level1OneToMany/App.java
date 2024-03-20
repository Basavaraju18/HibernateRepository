package com.L1OtoM.Level1OneToMany;

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

// ONE TO MANY
public class App 
{
    public static void main( String[] args )
    {
//    	
//    	Food f1=new Food();
//    	f1.setfId(1);
//    	f1.setfName("Butternan");
//    	
//    	
//    	Food f2=new Food();
//    	f2.setfId(2);
//    	f2.setfName("Roti");
//    	
//    	Food f3=new Food();
//    	f3.setfId(3);
//    	f3.setfName("Chiken");
//    	
//    	Restaurant r1=new Restaurant();
//    	r1.setrId(10);
//    	r1.setrName("Pes ground");
//    	
//    	List<Food> f=new ArrayList<Food>();
//    	f.add(f1);
//    	f.add(f2);
//    	f.add(f3);
//    	r1.setfList(f);
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Restaurant.class).addAnnotatedClass(Food.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session1=sf.openSession();
    	Transaction transaction1=session1.beginTransaction();
    	
//    	session1.save(r1);
//    	
//    	for(Object ele:f) {
//    		session1.save(ele);
//    	}
    	
    	Food food1=session1.get(Food.class, 1);
    	System.out.println(food1);
    	
    	System.out.println("============CLIENT 02===========");
    	Session session2=sf.openSession();
    	Transaction transaction2=session2.beginTransaction();
    	
    	Food food2=session2.get(Food.class, 1);
    	System.out.println(food2);
    	
    	
    	System.out.println("============CLIENT 03===========");
    	Session session3=sf.openSession();
    	Transaction transaction3=session3.beginTransaction();
    	
    	Food food3=session3.get(Food.class, 3);
    	System.out.println(food3);
    	
    	
    	transaction1.commit();
    	transaction2.commit();
    	transaction3.commit();
    	session1.close();
    	session1.close();
    	session1.close();
    }
}
