package com.practice.JpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Alien b = new Alien();
    	b.setAname("Mark");
    	b.setTech("Aero");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	
    	em.persist(b);
    	
    	em.getTransaction().commit();
        Alien a = em.find(Alien.class, 5);
        System.out.println(a);
    }
}
