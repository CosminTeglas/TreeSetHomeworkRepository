package org.example;

import java.util.List;
public class Hobby {
    String hobbyName;
    int hobbyFrequency;
    List<Adress> hobbyAdresses;

    /**
     * This is the constructor for the class hobby
     * @param hobbyName;
     * @param hobbyFrequency;
     * @param hobbyAdresses;
     */
    public Hobby(String hobbyName, int hobbyFrequency, List<Adress> hobbyAdresses) {
        this.hobbyName = hobbyName;
        this.hobbyFrequency = hobbyFrequency;
        this.hobbyAdresses = hobbyAdresses;
    }

    /**
     * This is the method that gets the name of the hobby
     * @return hobbyName;
     */
    public String getHobbyName() {
        return hobbyName;
    }

    /**
     * This is the method that gets the frequency of the hobby
     * @return hobbyFrequency;
     */

    public int getHobbyFrequency() {
        return hobbyFrequency;
    }

    /**
     * This is the method that gets the address of the hobby
     * @return hobbyAddress;
     */

    public List<Adress> getHobbyAdresses(){
        return hobbyAdresses;
    }

}