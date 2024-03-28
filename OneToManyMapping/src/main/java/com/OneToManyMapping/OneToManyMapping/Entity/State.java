package com.OneToManyMapping.OneToManyMapping.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long StatePIN;
    private String StateName;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStatePIN() {
        return StatePIN;
    }

    public void setStatePIN(long StatePIN) {
        this.StatePIN = StatePIN;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String StateName) {
        this.StateName = StateName;
    }

  
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
    	
    	String s="\nState\n" +
                "State_ID=" + id +
                "\nStatePIN= " + StatePIN +
                "\nState Name = "+StateName  +
                "\nCountry id details = "+  country.getId() ;
    	
        return s;
    }
}