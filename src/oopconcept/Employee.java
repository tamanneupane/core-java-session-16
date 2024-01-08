package oopconcept;

public class Employee {
    //field
    private String name;
    private Integer id;
    private double salary;
    private int age;

    //constructor
    public Employee() { //default constructor

    }

    //method
    public void setDetails(String name, Integer id, double salary, int age) {
        this.name = name; //assign value
        if (id != null && id > 10) { // id == null (==) compare
            this.id = id;
        }
        this.salary = salary;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }


}
