package com.OneToOneMapping.OnetoOne;

import com.OneToOneMapping.OnetoOne.Configuration_type.* ;
import com.OneToOneMapping.OnetoOne.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Country p1 = new Country();
         p1.setName("India");
        p1.setEmail("IndianPm@gmail.com");

        PrimeMinister a1 = new PrimeMinister();
        a1.setPrimeMinister("Narendra Modi");

        a1.setPM(p1);
        p1.setPMDetails(a1);
        
        Country p2 = new Country();
        p2.setName("USA");
       p2.setEmail("AmericanPm@gmail.com");

       PrimeMinister a2 = new PrimeMinister();
       a2.setPrimeMinister("Narendra Modi");

       a2.setPM(p2);
       p2.setPMDetails(a2);

        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.getTransaction().commit();

        System.out.println("\nCountry table data  ");
        Country savedCountry1 = session.get(Country.class, 1);
        Country savedCountry2 = session.get(Country.class, 2);
        System.out.println(savedCountry1);
        System.out.println(savedCountry2);

       System.out.println("\nPrime Minister table data  ");
     PrimeMinister savedPrime1 = session.get(PrimeMinister.class, 1);
     PrimeMinister savedPrime2 = session.get(PrimeMinister.class, 2);
        System.out.println(savedPrime1);
        System.out.println(savedPrime2);
        

        session.close();
    }
}