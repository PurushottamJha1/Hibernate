package com.OneToManyMapping.OneToManyMapping.Entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "firstName")
    private String Name;


    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<State> CountryStateDetails;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public List<State> getCountryStateDetails() {
        return CountryStateDetails;
    }

    public void setCountryStateDetails(List<State> CountryStateDetails) {
        this.CountryStateDetails = CountryStateDetails;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Country {" +
                "id=" + id +
                ", Name ='" + Name + '\'' +
   
                ", State Number=");

        for(State acc : CountryStateDetails){
            res.append(acc.getStatePIN());
        }

        res.append("}");

        return res.toString();
    }
}