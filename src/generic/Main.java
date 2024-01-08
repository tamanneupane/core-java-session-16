package generic;

import inheritance.Manager;
import inheritance.Staff;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        System.out.println(sum(1, 2)); //integer
//        System.out.println(sum(1L, 2L)); //long
//        System.out.println(sum(1.0f, 2.0f));//float
//        System.out.println(sum((short) 1, (short) 2));//sort
//        System.out.println(sum("ashihs", "ram"));//string
//        System.out.println(sum(new Person(), new Person()));//string
//        System.out.println(sum(1, 2));
//        System.out.println(sum(1f, 2f));
//        System.out.println(sum(1L, 2L));
////        sum("ashish", "hari");


//        Generic<String> generic = new Generic<>();
////
//        generic.setData("ashish");
////
//        Generic<Integer> generic2 = new Generic<>();
////
//        generic2.setData(2);

        currencyPrinter("NRS", 1);
        currencyPrinter("NRS", 1);
        currencyPrinter("NRS", 1);

//        Generic<String, Integer> generic = new Generic<>();
//        Generic<Person, Long> generic3 = new Generic<>();
//        Generic<Long, Long> generic2 = new Generic<>();

//        System.out.println(generic.toString());
//        System.out.println(generic2.toString());
//
//        System.out.println(generic2.getClass() == generic.getClass());
//        generic.setData("asdasd");
//        generic.setData2(12);
//Map
//        Person[] personArray = new Person[2];
//        Generic<String,Integer>[] person2Array = new Generic<String,Integer>[3];

        Generic<Manager> managerGeneric = new Generic<>();
        Generic<Staff> staffGeneric = new Generic<>();
        Generic<String> staffGeneric3 = new Generic<>();
        Generic<Integer> asdf = new Generic<>();

        nameSetter(managerGeneric);
        nameSetter(staffGeneric);
        nameSetter(staffGeneric3);

    }

    public static void nameSetter(Generic<?> generic) {
//        generic.getData().setName("asdfsdf");
    }

//    public static <T> void nameSetter(Generic<T> generic) {
////        generic.getData().setName("asdfsdf");
//    }


    public static Generic<?> valueReturn() {
        if (true) {
            return new Generic<Integer>();
        } else {
            return new Generic<String>();
        }
    }


    public static <T extends String, E extends Number> void currencyPrinter(T currencyName, E currencyNumber) {
        System.out.println(currencyName + " " + currencyNumber);
    }

    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }


//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static float sum(float a, float b) {
//        return a + b;
//    }
//
//    public static long sum(long a, long b) {
//        return a + b;
//    }
//
//    public static int sum(short a, short b) {
//        return a + b;
//    }

}
