package com.ManyToOneMapping.ManyToOneMapping.Entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "firstName")
    private String fname;
    @Column(name = "lastName")
    private String lname;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<CodingPlatform> personCodingPlatform;

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CodingPlatform> getPersonCodingPlatform() {
        return personCodingPlatform;
    }

    public void setPersonCodingPlatform(List<CodingPlatform> personCodingPlatform) {
        this.personCodingPlatform = personCodingPlatform;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Person{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", Visited Cities=");

        for(CodingPlatform acc : personCodingPlatform){
            res.append(acc.getCity()).append(", ");
        }

        res.append("}");

        return res.toString();
    }
}