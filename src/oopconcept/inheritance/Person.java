package oopconcept.inheritance;

import oopconcept.Gender;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
