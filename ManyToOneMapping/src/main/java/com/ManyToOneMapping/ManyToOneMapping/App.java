package com.ManyToOneMapping.ManyToOneMapping;

import com.ManyToOneMapping.ManyToOneMapping.*;
import  com.ManyToOneMapping.ManyToOneMapping.Entity.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {

        Person p1 = new Person();
        p1.setFname("Purushottam");
        p1.setLname("Jha");
        p1.setEmail("Purushottam@gmail.com");

        List<CodingPlatform> list = new ArrayList<>();

        CodingPlatform of1 = new CodingPlatform();
      
        of1.setWebsiteName("Leetcode");
        of1.setLocality("Sector 51");
        of1.setCity("Gurugram");
        of1.setState("Haryana");
        of1.setPinCode("123456");
        list.add(of1);

        CodingPlatform of2 = new CodingPlatform();
       
        of2.setWebsiteName("GeeksForGeeks");
        of2.setLocality("Sector 23");
        of2.setCity("Delhi");
        of2.setState("Delhi NCR");
        of2.setPinCode("120213");
        list.add(of2);

        of1.setPerson(p1);
        of1.setPerson(p1);
        p1.setPersonCodingPlatform(list);

        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.persist(p1);

        session.getTransaction().commit();

        System.out.println(" Person  :");
        Person savedPerson = session.get(Person.class, 1L);
        System.out.println(savedPerson);

        System.out.println("CodingPlatform  :");
        CodingPlatform savedCodingPlatform1 = session.get(CodingPlatform.class, 1L);
        System.out.println(savedCodingPlatform1);

        CodingPlatform savedCodingPlatform2 = session.get(CodingPlatform.class, 2L);
        System.out.println(savedCodingPlatform2);

        session.close();
    }
}