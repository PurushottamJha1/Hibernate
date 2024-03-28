package com.ManyToMnayMapping.ManyToMnayMapping;

import com.ManyToMnayMapping.ManyToMnayMapping.configurations.*;

import com.ManyToMnayMapping.ManyToMnayMapping.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.*;
public class App
{
    public static void main( String[] args )
    {

        System.out.println("Many to Many Mapping on pilot anf flight");

        Pilot ac1 = new Pilot();
        ac1.setfName("Purushottam");
        ac1.setlName("Jha");
        ac1.setEmail("Purushottam@gmail.com");

        Pilot ac2 = new Pilot();
        ac2.setfName("Raj");
        ac2.setlName("Kumar");
        ac2.setEmail("Rajn@gmail.com");

        List<Pilot> Pilot = new ArrayList<>();
        Pilot.add(ac1);
        Pilot.add(ac2);

        Flight m1 = new Flight();
        m1.setName("Air India");
        m1.setType("Commercial");

        Flight m2 = new Flight();
        m2.setName("Vistara");
        m2.setType("Passenger");

        List<Flight> Flights = new ArrayList<>();
        Flights.add(m1);
        Flights.add(m2);

        ac1.setFlight(Flights);
        ac2.setFlight(Flights);

        m1.setPilots(Pilot);
        m2.setPilots(Pilot);




        SessionFactory sessionFPiloty = Utility.getSessionFactory();
        Session session = sessionFPiloty.openSession();
        session.beginTransaction();

        session.persist(ac1);
        session.persist(ac2);
        session.persist(m1);
        session.persist(m2);

        session.getTransaction().commit();

        System.out.println("\nPilot Table");
        Pilot savedPilot1 = session.get(Pilot.class, 1L);
        System.out.println(savedPilot1);

        Pilot savedPilot2 = session.get(Pilot.class, 2L);
        System.out.println(savedPilot2);

        System.out.println("\nFlights Table");
        Flight savedFlight1 = session.get(Flight.class, 1L);
        System.out.println(savedFlight1);

        Flight savedFlight2 = session.get(Flight.class, 2L);
        System.out.println(savedFlight2);

        session.close();
    }
}