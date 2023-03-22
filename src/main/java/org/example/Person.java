package org.example;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class with 9 methods
 */

public class Person {
    public String name;
    public int age;
    public String type;

    public List<String> listOfHobbies;

    /**
     * This is the constructor for the class Person
     * @param name;
     * @param age;
     * @param type;
     */

    public Person(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.listOfHobbies = new ArrayList<String>();
    }

    /**
     * This is a method that adds the hobby to the listOfHobbies
     * @param hobby;
     */
    public void addHobby(String hobby) {
        this.listOfHobbies.add(hobby);
    }

    /**
     * This is a method that gets the name of the person
     * @return this.name;
     */

    public String getName() {
        return this.name;
    }

    /**
     * This is a method that gets the age of the person
     * @return this.age
     */

    public int getAge() {
        return this.age;
    }

    /**
     * This is a method that gets the type of the person
     * @return this.type;
     */
    public String getType() {
        return this.type;
    }

    /**
     * This is a method that gets the list of the hobbies
     * @return this.listOfHobbies;
     */
    public List<String> getListOfHobbies() {
        return this.listOfHobbies;
    }

    /**
     * This is a  method that override the String.
     *  @return
     */

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age + " Type: " + this.type +" Hobies: " +listOfHobbies;
    }
}

/**
 * This is a method that sort the persons by name
 */
class sortPersonByName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

/**
 * This is a method that sorts the persons by age
 */

class sortPersonByAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.age > p2.age) {
            return -1;
        } else
            return 1;
    }
}
