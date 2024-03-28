package com.ManyToMnayMapping.ManyToMnayMapping.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "pilot")
public class Pilot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fName;
    private String lName;
    private String email;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Flight> Flight;

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Flight> getFlight() {
        return Flight;
    }

    public void setFlight(List<Flight> Flight) {
        this.Flight = Flight;
    }

    @Override
    public String toString() {
        
        StringBuilder res = new StringBuilder();

        for (Flight m : getFlight()) {
            res.append(m.getName()).append(" ").append(m.getType()).append(", ");
        }

        String r1 = res.substring(0, res.length() - 2);
        String r="Pilot \n"+"id="+id+"\nFirst Name="+fName+"\nlast Name="+lName+"\nEmail="+email+"\nFlights "+"\n"+r1;

        return r.toString();
        
    }
}
