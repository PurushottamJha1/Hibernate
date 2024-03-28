package com.ManyToOneMapping.ManyToOneMapping.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "office")
public class CodingPlatform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String WebsiteName;
    private String locality;
    private String city;
    private String state;
    private String pinCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    public int getId() {
        return id;
    }

    public String getWebsiteName() {
        return WebsiteName;
    }

    public void setWebsiteName(String houseNumber) {
        this.WebsiteName = houseNumber;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Office {" +
                "id=" + id +
                ", Website Name ='" + WebsiteName + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", person=" + person.getId() +
                '}';
    }
}