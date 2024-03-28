package com.OneToOneMapping.OnetoOne.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "PrimeMinister")
public class PrimeMinister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "PrimeMinister")
    private String PrimeMinister;

    @OneToOne(mappedBy = "pm", cascade = CascadeType.ALL)
    private Country country;

    public int getId() {
        return id;
    }

    public String getPrimeMinister() {
        return PrimeMinister;
    }

    public void setPrimeMinister(String PrimeMinister) {
        this.PrimeMinister = PrimeMinister;
    }

    public Country getPM() {
        return country;
    }

    public void setPM(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Prime Minister {" +
                "id=" + id +
                ", Prime Minister Name ='" + PrimeMinister + '\'' +
                ", person=" + (country != null ? country.getId() : "null") +
                '}';
    }
}