package RelationalAndOperator;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 2;


        if (a == b) { // equality
            // if a and b are equal the code here will execute.
//            System.out.println("A and B are equal");
        }

        if (a != b) {//inequality
//            System.out.println("A and B are not equal");
        }

        if (a < b) { //(less than)
//            System.out.println(" b is greater");
        }

        if (a > b) { //(greater than)
//            System.out.println(" a is greater");
        }
        if (a <= b) { //less than or equal
//            System.out.println("a is smaller or equal to b");
        }
        if (a >= b) { //greater than or equal
//            System.out.println("a is greater or equal to b");
        }

        int obtainedMarks = 50;
        int passingMarks = 50;

        //wap to print if the student has passed or failed in english subject


        if (obtainedMarks >= passingMarks) {
//            System.out.println("Student has passed");
        }

        if (obtainedMarks < passingMarks) {
//            System.out.println("Student has failed");
        }

//        int bodyTemp = 10_000_000; //underscore


//        System.out.println(checkFever(30));
//        checkMaxOfNumbers(100, 100);
//        checkEven(800, 800);
//        checkIfAnyNumberIsEven(100, 7);

//        System.out.println(ternaryOperator(1, 10));
        ternaryOperator(1, 10);
    }


    //    Ternary Operator
    public static void ternaryOperator(int a, int b) { //return the max of 2 number
        ///if the statement is ture this will return the left hand side of the operation else right side
        System.out.println(a > b ? "a" : "b");
//        return a > b ? a : b;  // a=1,b=10 ==> return 1>10?left:right

//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }

    }

    //wap to check if one of the two number are even
    //OR ( || ) if any one of the statement is true then the condition is satisfied
    public static void checkIfAnyNumberIsEven(int num1, int num2) {
        if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println("either num1 or num2 is even");
        }
    }


    //  Write a program that takes  two numbers and  check if both numbers are even and print both number are even.
    //AND operator && (ra)
    public static void checkEven(int num1, int num2) {
        if (num1 % 2 == 0 && num2 % 2 == 0) {// if num1 even and num2 even
            System.out.println("both are even");
        }

//        if (num1 % 2 == 0) {
//
//        }
//        if (num2 % 2 == 0) {
//
//        }


        // number % 2 == 0  // if there is reminder then gives 1 or else 0
//        if (number % 2 == 0) {
//            System.out.println("even");
//        }
//        if (number % 2 == 1) {
//            System.out.println("odd");
//        }


//        801 / 2  =  400.5  //odd
//        800 / 2 == 400 //even
        //      number /2 == reminder aayo vane odd
        //      number /2 == reminder aayena vane even


    }

    //Write a java program to find maximum between two numbers or check if equal
    public static void checkMaxOfNumbers(int a, int b) {

//// method -1
//        if (a > b) {
//            System.out.println("a is greater");
//        }
//        if (b > a) {
//            System.out.println("b is greater");
//        }
//        if (a == b) {
//            System.out.println("both are equal");
//        }

// method -2
        if (a > b) {
            System.out.println("a is greater");
        } else if (b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("both are equal");
        }

    }


    //wap to check if a person has fever or not
    public static String checkFever(int bodyTemp) {
        if (bodyTemp >= 40) { //conditional //false
            return "You have a fever";
        }
        //if program come here this mean he does not have any fever
        return "You dont have fever";
    }
}
