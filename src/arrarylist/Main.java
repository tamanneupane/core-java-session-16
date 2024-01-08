package arrarylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] foodEaten = new int[7];
        foodEaten[0] = 3;
        foodEaten[1] = 2;
        foodEaten[2] = 5;
        foodEaten[3] = 6;
        foodEaten[4] = 7;
        foodEaten[5] = 10;
        foodEaten[6] = 1;


//        System.out.println(foodEaten[3]);

//        for (int value:foodEaten) {
//            if(value == 10){
//                System.out.println("Contains 10");
//            }
//        }


        ArrayList<Integer> foodEatenList = new ArrayList<>();

        foodEatenList.add(Integer.valueOf(3));
        foodEatenList.add(2);
        foodEatenList.add(5);
        foodEatenList.add(6);
        foodEatenList.add(7);
        foodEatenList.add(10);
        foodEatenList.add(1);

        int foodEatenDaySecond = foodEatenList.get(1);

        ArrayList<Employee> googleEmployeeList = new ArrayList<>(10_000);

//        googleEmployeeList.ensureCapacity(100000);

        googleEmployeeList.add(new Employee("ram", 1)); // 0
        googleEmployeeList.add(new Employee("sam", 2)); // 1
        //
        googleEmployeeList.add(new Employee("hari", 3));// 2
        googleEmployeeList.add(new Employee("ashish", 4)); // 3

//        googleEmployeeList.add(2,new Employee("ravi",10));

        Employee sam = googleEmployeeList.get(1);
        Employee hari = googleEmployeeList.get(2);


        googleEmployeeList.add(2, sam);
        googleEmployeeList.add(1, hari);


//        System.out.println(googleEmployeeList.get(2).getName());
//        System.out.println(googleEmployeeList.get(1).getName());

        Integer a = 3000;
        Integer b = 3000;

        int a1 = 30000;
        int b1 = 30000;


//        System.out.println(a == b);
//        System.out.println(a1 == b1);

        String[] names = new String[]{"ashish", "ram", "hari", "sam"};

        namesPrinter(1,3,4,5,6,6,7,78,8,8,8,9,9,9,9,907,63,4);
        namesPrinter(new Integer[]{1,2,4,5,634,56,3456,345,6,356});


    }


    public static void namesPrinter(Integer... names) {
        for (Integer name : names) {
            System.out.println(name);
        }
    }

    public static void namesPrinter2(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
