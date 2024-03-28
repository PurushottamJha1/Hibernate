package com.OneToOneMapping.OnetoOne.Entity;



import jakarta.persistence.*;

@Entity
@Table(name = "Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "Name")
    private String name;

    @Column(name = "PrimeMinisteremail")
    private String PrimeMinisteremail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PrimeMinister_id")
    private PrimeMinister pm;
     private int c=1;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    


    public String getEmail() {
        return PrimeMinisteremail;
    }

    public void setEmail(String PrimeMinisteremail) {
        this.PrimeMinisteremail = PrimeMinisteremail;
    }

    public PrimeMinister getPMDetails() {
        return pm;
    }

    public void setPMDetails(PrimeMinister pm) {
        this.pm = pm;
    }

    @Override
    public String toString() {
    	if(c==1) {
    		String s="Country :\n" +
                    "Country_ID=" + id +
                    "\nCountry Name= " + name  +
                    "\nPrime Minister = "+PrimeMinisteremail +
                    "\nPrimeMinister ID details = "+  (pm != null ? pm.getId() : "null") ;
    		c=0;
    		return s;
    	}
    	
    		String s="\n" +
                    "Country_ID=" + id +
                    "\nCountry Name= " + name  +
                    "\nPrime Minister = "+PrimeMinisteremail +
                    "\nPrimeMinister ID details = "+  (pm != null ? pm.getId() : "null") ;
    		return s;
    	
    	
    	
       
    }
}