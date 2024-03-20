package com.LevelTwoCache.LevelTwoCache2;

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
//		    	Product p1=new Product();
//		    	p1.setpId(1);
//		    	p1.setpName("Pen");
//		    	p1.setpPrice(10);
//		    	
//		    	Product p2=new Product();
//		    	p2.setpId(2);
//		    	p2.setpName("Book");
//		    	p2.setpPrice(40);
//		    	
//		    	Product p3=new Product();
//		    	p3.setpId(3);
//		    	p3.setpName("Bag");
//		    	p3.setpPrice(50);
//		    	
//		    	Product p4=new Product();
//		    	p4.setpId(4);
//		    	p4.setpName("Phone");
//		    	p4.setpPrice(60);
//		    	
//		    	Product p5=new Product();
//		    	p5.setpId(5);
//		    	p5.setpName("Bottle");
//		    	p5.setpPrice(30);
//		    	
//		    	
//		    	Product p6=new Product();
//		    	p6.setpId(6);
//		    	p6.setpName("Phone");
//		    	p6.setpPrice(43);
//		    	
//		    	Product p7=new Product();
//		    	p7.setpId(7);
//		    	p7.setpName("Bat");
//		    	p7.setpPrice(60);
		    	
//		    	Product p8=new Product();
//		    	p8.setpId(8);
//		    	p8.setpName("Phone");
//		    	p8.setpPrice(60);
//		    	
//		    	
//		    	Product p9=new Product();
//		    	p9.setpId(9);
//		    	p9.setpName("Box");
//		    	p9.setpPrice(70);
//		    	
//		    	Product p10=new Product();
//		    	p10.setpId(10);
//		    	p10.setpName("Ball");
//		    	p10.setpPrice(60);

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory sf=cfg.buildSessionFactory();

		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();

		Product pr=session.get(Product.class, 1);
		System.out.println(pr);

		System.out.println("===========CLIENT 02==============");
		Session session2=sf.openSession();
		Transaction tran2=session2.beginTransaction();

		Product pr2=session2.get(Product.class, 2);
		System.out.println(pr2);
		
		Product pr7=session2.get(Product.class, 10);
		System.out.println(pr7);

		System.out.println("==========CLIENT 03============");
		Session session3=sf.openSession();
		Transaction tran3=session3.beginTransaction();

		Product pr3=session3.get(Product.class, 2);
		System.out.println(pr3);

		Product pr4=session3.get(Product.class, 1);
		System.out.println(pr4);
		
		Product pr5=session3.get(Product.class, 6);
		System.out.println(pr5);

//		    	List<Product> pList=new ArrayList<Product>();
//		    	pList.add(p1);
//		    	pList.add(p2);
//		    	pList.add(p3);
//		    	pList.add(p4);
//		    	pList.add(p5);
//		    	pList.add(p6);
//		    	pList.add(p7);
//		    	pList.add(p8);
//		    	pList.add(p9);
//		    	pList.add(p10);
//		    	
//		    	
//		    	for(Product prd:pList) {
//		    		session.save(prd);
//		    	}
//		    	
		    	
		tran.commit();
		session.close();

		tran2.commit();
		session2.close();

		tran3.commit();
		session3.close();

	}
}
