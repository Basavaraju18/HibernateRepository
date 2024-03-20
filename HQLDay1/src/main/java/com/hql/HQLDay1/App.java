package com.hql.HQLDay1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Order1 o1=new Order1();
//    	o1.setoId(1);
//    	o1.setoName("Dosa");
//    	o1.setoPllace("Jayanager");
//    	
//    	Order1 o2=new Order1();
//    	o2.setoId(2);
//    	o2.setoName("Idli");
//    	o2.setoPllace("Basavanagudi");
//    	
//    	Order1 o3=new Order1();
//    	o3.setoId(3);
//    	o3.setoName("palav");
//    	o3.setoPllace("Vidyapeeta");
//    	
//    	Order1 o4=new Order1();
//    	o4.setoId(4);
//    	o4.setoName("Chitranna");
//    	o4.setoPllace("Mandya");
//    	
    	
    	
    	Configuration cfg= new Configuration().configure().addAnnotatedClass(Order1.class);
     	SessionFactory sf=cfg.buildSessionFactory();
     	
     	Session session1 = sf.openSession();
     	Transaction transaction1=session1.beginTransaction();
//     	
//     	List<Order1> oList=new ArrayList<Order1>();
//     	oList.add(o1);
//     	oList.add(o2);
//     	oList.add(o3);
//     	oList.add(o4);
//     	
//     	for(Order1 or: oList) {
//     		session1.save(or);
//     	}
//     	
     	// WRITING HQL Query
//     	Query <Order1> query = session1.createQuery("from Order1 where oName like '%Dosa%'");
//     	Query <Order1> query = session1.createQuery("from Order1  order by oId desc");
//     	Query <Order1> query = session1.createQuery("from Order1 group by oName");
     	
     	// Sql query
     	NativeQuery<Order1> query=session1.createNativeQuery("Select * from Order1 order by oId desc ",Order1.class);
     	
     	List list = query.list();
     	
     	for(int i=0; i<list.size(); i++) {
     		
     		System.out.println(list.get(i).toString());
     	}
     	
     	transaction1.commit();
     	session1.close();
     	
    	
    	
    }
}
