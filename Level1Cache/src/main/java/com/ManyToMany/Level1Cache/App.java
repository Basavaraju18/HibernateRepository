package com.ManyToMany.Level1Cache;

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
//    	User u1=new User();
//    	u1.setUid(1);
//    	u1.setuName("Arun");
//    	u1.setuPass("arun@123");
//    	
//    	User u2=new User();
//    	u2.setUid(2);
//    	u2.setuName("Charan");
//    	u2.setuPass("charan@123");
//    	
//    	
//    	User u3=new User();
//    	u3.setUid(3);
//    	u3.setuName("Kiran");
//    	u3.setuPass("Kiran@123");
//    	
//    	User u4=new User();
//    	u4.setUid(4);
//    	u4.setuName("Praveen");
//    	u4.setuPass("praveen@123");
    	
//    	User u5=new User();
//    	u5.setUid(5);
//    	u5.setuName("Tarun");
//    	u5.setuPass("traun@123");
//    	
//    	User u6=new User();
//    	u6.setUid(6);
//    	u6.setuName("Sharn");
//    	u6.setuPass("sharn@123");
//   	
//    	User u7=new User();
//    	u7.setUid(7);
//    	u7.setuName("Varun");
//    	u7.setuPass("varun@123");

    	
    	Configuration cfg= new Configuration().configure().addAnnotatedClass(User.class);
     	SessionFactory sf=cfg.buildSessionFactory();
     	
     	System.out.println("=============CLIENT 01================");
     	Session session1 = sf.openSession();
     	Transaction transaction1=session1.beginTransaction();
     	
     	User user1=session1.get(User.class, 1);
     	System.out.println(user1);
     	
     	
     	User user2=session1.get(User.class, 3);
     	System.out.println(user2);
     	
     	System.out.println("=============CLIENT 02================");
     	Session session2 = sf.openSession();
     	Transaction transaction2=session2.beginTransaction();
     	
     	User user3=session2.get(User.class, 4);
    	System.out.println(user3);
    	
    	System.out.println("=========================CLIENT 03=======");
    	Session session3=sf.openSession();
    	Transaction transaction3=session3.beginTransaction();
    	
    	User user4=session3.get(User.class, 6);
    	System.out.println(user4);
    	
//     	List<User> uList=new ArrayList<User>();
//     	uList.add(u1);
//     	uList.add(u2);
//     	uList.add(u3);
//     	uList.add(u4);
//     	uList.add(u5);
//     	uList.add(u6);
//     	uList.add(u7);
//
//     	
//     	for(User u: uList) {
//     		session1.save(u);
//     	}
     	
     	transaction1.commit();
     	session1.close();
     	transaction2.commit();
     	session2.close();
     	transaction3.commit();
     	session3.close();

     	
   	
    }
}
