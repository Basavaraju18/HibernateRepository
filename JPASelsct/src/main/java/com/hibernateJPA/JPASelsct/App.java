package com.hibernateJPA.JPASelsct;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee e=new Employee();
    	e.setName("Bas");
    	e.setId(101);
    	e.setSal(100);
    	
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("empUnit");
    	EntityManager em=emf.createEntityManager();
    	EntityTransaction et=em.getTransaction();
    	et.begin();
    	em.persist(e);
    	et.commit();
    	
    }
}
