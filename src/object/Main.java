package object;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(); //FF
        person1.setName("ashish");
        person1.setAge(80);

        Person person2 = new Person(); //F2
        person2.setName("ram");
        person2.setAge(70);

        Person person3 = new Person(); //X3
        person3.setName("ashish");
        person3.setAge(60);


        Bottle bottle1 = new Bottle(); //F3
        bottle1.setBrandName("baltra");
        bottle1.setModelNumber(12);

        Bottle bottle2 = new Bottle(); //F5
        bottle2.setBrandName("vista");
        bottle2.setModelNumber(5);

        Bottle bottle3 = new Bottle(); //F5
        bottle3.setBrandName("baltra");
        bottle3.setModelNumber(12);


//        System.out.println(bottle1.hashCode());
//        System.out.println(bottle2.hashCode());
//        System.out.println(bottle3.hashCode());

        String name = "Ok";
        String name2 = new String("Ok");


        StringBuilder name1 = new StringBuilder("Ok");
        StringBuilder name4 = new StringBuilder("Ok");
//        System.out.println(name1.hashCode());
//        System.out.println(name4.hashCode());

//        System.out.println(name2 == name);
//
//        System.out.println(name.hashCode());
//        System.out.println(name2.hashCode());

//        System.out.println(bottle1.equals(bottle2));
//        System.out.println(bottle1 == bottle2);
//
//        System.out.println(bottle1.equals(bottle3));
//        System.out.println(bottle1 == bottle3);


        Person p1 = new Person();
        p1.setAge(1);
        p1.setName("Ravi");

        System.out.println(p1);
//        System.out.printf("name : %s age %d", p1.getName(), p1.getAge());

        Bottle b1 = new Bottle();
        b1.setModelNumber(3423);
        b1.setBrandName("xyz");

        System.out.println(b1);

    }
}
