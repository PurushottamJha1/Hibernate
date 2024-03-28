package com.OneToManyMapping.OneToManyMapping;

import com.OneToManyMapping.OneToManyMapping.Configurations.*;

import com.OneToManyMapping.OneToManyMapping.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {

        Country p1 = new Country();
        p1.setName("India");

        List<State> list = new ArrayList<>();

        State acc1 = new State();
        acc1.setStatePIN(3678568997L);
        acc1.setStateName("INDIA");
      
        list.add(acc1);

        State acc2 = new State();
        acc2.setStatePIN(367997L);
        acc2.setStateName("USA");
        list.add(acc2);

        acc1.setCountry(p1);
        acc2.setCountry(p1);
        p1.setCountryStateDetails(list);

        SessionFactory sessionFactory = Utility.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.persist(p1);

        session.getTransaction().commit();

        System.out.println("\nCountry Table data ");
        Country savedCountry = session.get(Country.class, 1L);
        System.out.println(savedCountry);

        System.out.println("\nState Table data ");
        State savedState = session.get(State.class, 1L);
        System.out.println(savedState);

        State savedState2 = session.get(State.class, 2L);
        System.out.println(savedState2);

        session.close();
    }
}