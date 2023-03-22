package org.example;

import java.util.*;

/**
 * This is class App which contains the main method.
 */

public class App {
    public static void main(String[] args) {
        Collection<Person> myTreeSet = new TreeSet<Person>(new sortPersonByName());

        Person person1 = new Person("Cosmin", 24, "Student");
        Person person2 = new Person("Alexadra", 26, "Unemployed");
        Person person3 = new Person("Tudor", 33, "Employed");

        person1.addHobby("Football");
        person2.addHobby("Tennis");
        person3.addHobby("Swimming");

        myTreeSet.add(person1);
        myTreeSet.add(person2);
        myTreeSet.add(person3);

        for (Person p : myTreeSet) {
            System.out.println(p);
        }

        List<Adress> listOfAdressesForFootball = new ArrayList<Adress>();
        List<Adress> listOfAdressesForTennis = new ArrayList<Adress>();
        List<Adress> listOfAdressesForSwimming = new ArrayList<Adress>();


        Adress adress1 = new Adress("Viorelelor", 15);
        Adress adress2 = new Adress("Plopilor", 63);
        Adress adress3 = new Adress("Dorobantilor", 77);

        adress1.setCountry("Romania");
        adress2.setCountry("United Kingdom");
        adress3.setCountry("Hungary");

        listOfAdressesForFootball.add(adress1);
        listOfAdressesForTennis.add(adress2);
        listOfAdressesForTennis.add(adress3);
        listOfAdressesForSwimming.add(adress3);
        listOfAdressesForSwimming.add(adress1);

        Hobby football = new Hobby("Football", 5, listOfAdressesForFootball);
        Hobby tennis = new Hobby("Tennis", 3, listOfAdressesForTennis);
        Hobby swimming = new Hobby("Swimming", 6, listOfAdressesForSwimming);

        System.out.println(football.getHobbyName() + " has the frequency " + football.getHobbyFrequency() +
                " and can be practiced at the adress " + football.getHobbyAdresses());
        System.out.println(tennis.getHobbyName() + " has the frequency " + tennis.getHobbyFrequency() +
                " and can be practiced at the adress " + tennis.getHobbyAdresses());
        System.out.println(swimming.getHobbyName() + " has the frequency " + swimming.getHobbyFrequency() +
                " and can be practiced at the adress " + swimming.getHobbyAdresses());


        Map<Person, List<Hobby>> myMap = new HashMap<>();

        List<Hobby> hobbiesForPerson1 = new ArrayList<>();

        hobbiesForPerson1.add(football);
        hobbiesForPerson1.add(tennis);

        List<Hobby> hobbiesForPerson2 = new ArrayList<>();

        hobbiesForPerson2.add(swimming);
        hobbiesForPerson2.add(tennis);

        List<Hobby> hobbiesForPerson3 = new ArrayList<>();

        hobbiesForPerson3.add(football);

        myMap.put(person1, hobbiesForPerson1);
        myMap.put(person2, hobbiesForPerson2);
        myMap.put(person3, hobbiesForPerson3);

        List<Hobby> hobbiesForCosmin = myMap.get(person1);

        System.out.println("Names of the hobbyes and countries where it can be practiced for Cosmin: ");
        for (Hobby h : hobbiesForCosmin) {
            System.out.println("Name: " + h.getHobbyName());
            for (Adress a : h.getHobbyAdresses()) {
                System.out.println("Country: " + a.country);
            }
        }
    }
}