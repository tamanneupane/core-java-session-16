package inputandoutput;

import string.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Type  var name = Object(parms)
//        Student ram = new Student(1);
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you name?");


        String name = scanner.nextLine();


        System.out.println("What is you age ?");

        int age = scanner.nextInt();


        System.out.println("your name is " + name + " you age is " + age);




    }
}
