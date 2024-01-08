package inheritance;

public class Animal {
    public Animal() {
    }

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    private String name;
    private int age;

    void eat() {
        System.out.println("animal is eating");
    }

    void walk() {
        System.out.println("animal is walking");
    }


    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animal setAge(int age) {
        this.age = age;
        return this;
    }
}
