package com.ManyToMnayMapping.ManyToMnayMapping.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String Type;

    @ManyToMany(mappedBy = "Flight") // Corrected mappedBy attribute
    private List<Pilot> pilots;

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
    	
        StringBuilder res = new StringBuilder();

        for (Pilot p : getPilots()) {
            res.append(p.getfName()).append(" ").append(p.getlName()).append(", ");
        }
        String r1 = res.substring(0, res.length() - 2);
        String r="Flight \n"+"id="+id+"\nName="+name+"\nFlights Type="+Type+"\nPilots "+"\n"+r1;

        return r.toString();
    }
}
