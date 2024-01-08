package learninterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Bike bike = new Bike();
        bike.setName("Honda");
        bike.setSpeed(100);
        bike.calculateFair();

        Car car = new Car();
        car.setName("Tesla");
        car.setSpeed(60);
        car.calculateFair();

        Cycle cycle = new Cycle();
        cycle.setName("random");
        cycle.setSpeed(10);

//
//        startVehicle(bike);
//        startVehicle(car);
//        startVehicle(cycle); this is not allowed

//
//        startAccelerating(bike);
//        startAccelerating(car);
//        startAccelerating(cycle);


        Integer a = 3;
        Integer b = 5;
        Integer c = 3;
//
//        System.out.println(a.compareTo(b)); // -1 (3 compareTo 5)
//        System.out.println(b.compareTo(a)); // 1 (5 compareTo 3)
//        System.out.println(a.compareTo(c));// 0 (3 compareTo 3)


        String name1 = "a";
        String name2 = "b";
        String name3 = "a";
//
//        System.out.println(name1.compareTo(name2)); // -1 (a compareTo b)
//        System.out.println(name2.compareTo(name1)); // 1 (b compareTo a)
//        System.out.println(name3.compareTo(name1));// 0 (a compareTo a)


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(3));
        studentList.add(new Student(1));
        studentList.add(new Student(5));
        studentList.add(new Student(8));
        studentList.add(new Student(10));

        for (Student student : studentList) {
            System.out.println(student.getRollNo());
        }

        studentList.forEach((student -> System.out.println(student.getRollNo())));


        studentList.forEach(student -> System.out.println(student));
        studentList.forEach(System.out::println);


        System.out.println(studentList);

        Collections.sort(studentList);

        System.out.println(studentList);


// before java 8
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });

//after java 8 lambda expression
        Thread thread2 = new Thread(() -> System.out.println("hello"));

        Pizza pizza = new Pizza();
        int[] da  = new int[2];
        da[3] =3;

    }

    public static void startVehicle(Vehicle vehicle) {
        vehicle.startEngine();

    }


    public static void startAccelerating(EVehicle eVehicle) {
        eVehicle.accelerate();
    }

}
