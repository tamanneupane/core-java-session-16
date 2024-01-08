package enums;

import object.Person;
import string.Student;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Email email1 = new Email();
        email1.setMessage("hello");
        email1.setTo("ashish@gmail.com");

        Email email2 = new Email();
        email1.setMessage("hi");
        email1.setTo("ravi@gmail.com");


        var className = "java.util.Random"; // or any other name of a class with // a no-arg
        Class cl = Class.forName(className);
        Object obj = cl.getConstructor().newInstance();

        Random random = (Random) obj;
        System.out.println(random.nextInt(23));


//        var className = "java.util.Random"; // or any other name of a class with // a no-arg
//        constructor Class cl = Class.forName(className);
//        Object obj = cl.getConstructor().newInstance();

    }
}
