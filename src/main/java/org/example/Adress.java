package org.example;

/**
 * This is a class with 6 methods
 */

public class Adress {
    String streetNameAdress;
    int streetNumberAdress;
    String country;

    /**
     * This is the constructor of the class Adress
     * @param streetNameAdress;
     * @param streetNumberAdress;
     */
    public Adress(String streetNameAdress, int streetNumberAdress) {
        this.streetNameAdress = streetNameAdress;
        this.streetNumberAdress = streetNumberAdress;
    }

    /**
     * This is the method that gets the street name adress
     * @return streetNameAdress;
     */

    public String getStreetAdress() {
        return streetNameAdress;
    }

    /**
     * This is the method that gets street number adress
     * @return streetNumberAdress;
     */

    public int getNumberAdress() {
        return streetNumberAdress;
    }

    /**
     * This is the method that gets the county adress
     * @return country;
     */

    public String getCountry() {return country;}

    /**
     * This is the method that sets the country adress
     * @param country;
     */

    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * This is a  method that override the String.
     *  @return
     */

    @Override
    public String toString() {
        return "Street Name : " + this.streetNameAdress + " Street Number: " + this.streetNumberAdress;
    }
}