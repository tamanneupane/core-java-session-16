package string;

// in case of primitive data type (==) check value
// in case of objects ( == ) checks memory location of 2 var
public class Main {

    //how to compare or check the value of 2 objects
    public static void main(String[] args) {


        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        String s4 = "dog";

        if (s1.equals(s3)) {
//            System.out.println("both cat are equal");
        } else {
//            System.out.println("both cat are not equal");
        }


//        String name1 = "ashish khatiwada";
//
//        String name2 = "ram khatri";

//        String lastName = name1.substring(7, 16);
//        String firstName = name1.substring(0, 6);

//        System.out.println(firstName);
//        System.out.println(lastName);


        ///Concatenation
        String firstName = "ashish";
//
        String lastName = "khatiwada";


        String fullName = firstName + " " + lastName;

//        System.out.println(fullName);


        String repeat = "repeat";

//        System.out.println(repeat);
//        System.out.println(repeat.repeat(5));


        String greeting = "Hello"; // initialize greeting to a string
        if (greeting == "Hello") {
//            System.out.println(" probably true");
        }


        if (greeting.equals("Hello")) {
//            System.out.println("greeting is Hello");
        }


//        checkForNameAshish("AShIsH");

        String name = "ashish";

//        System.out.println("String is : " + name);
//        System.out.println("Length of string is : " + name.length());

//        Student student1 = new Student(1);
//        Student student2 = new Student(2);
//
//
//
//        if (student1.equals(student2)) {
//            System.out.println("both are equal");
//        } else {
//            System.out.println("both are not equal");
//        }


//        public boolean equals(Object obj) {
//            return student1 == student2
//        }


//        checkEmptyString("");

        String nepaliWord = "मंसिर";
        System.out.println(nepaliWord.length());

    }

    //WAP to check if string is empty or not
    public static void checkEmptyString(String s) {
        //1) check if string is empty or not
        //2) if empty print string is empty
        //3) else print the length of string

        if (s == null || s.length() == 0 ) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty with length of " + s.length());
        }

    }


    public static void checkForNameAshish(String name) {
        if (name.equalsIgnoreCase("Ashish")) {
            System.out.println("Your name is ashish");
        } else {
            System.out.println("Your name is not ashish");
        }
    }

//    public static void main(String[] args) {
//
//        Student student1 = new Student(1); //student1 -> ff(new Student(1);)
//        Student student2 = new Student(1);
//        Student student3 = new Student(3); //student3 -> tt(new Student(2))
//
////        int a = 0;
//        if (student1 == student3) { // xy == ff
//            System.out.println("student are  in same memory location");
//        } else {
//            System.out.println("student are not in same memory location");
//        }
//    }


    //Wap to

}
