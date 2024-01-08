package object;

public class Person {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Name = " + name + " , " + " Age = " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        Person person = (Person) obj;
        return this.name.equals(person.name) && this.age == person.age;
    }


    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}
