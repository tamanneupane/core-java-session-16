package oopconcept;

public class Main {
    public static void main(String[] args) {
        Employee ram = new Employee(); //object

        ram.setDetails("ram", 1, 1000, 22); //internal method used to set field/state value

        ram.displayDetails(); // Method used to display employee details


        Employee one = new Employee();
        one.setDetails("one", 40, 1000, 22);
//        one.displayDetails();


//        one.displayDetails();

        Employee two = new Employee();
        two.setDetails("two", 2, 2000, 22);
//        two.displayDetails();
        String name = "ashish";
//name == "ram" // is ashish and name are equal
        Employee third = two;
//        third.displayDetails();

        third.setDetails("third", 3, 3000, 33);

        System.out.println("Printing the value for third object");

//        third.displayDetails();
//        two.displayDetails();

        Boolean isApplicableForVaccine = null;//Initializing and employee with null reference


        Employee hire = null; //10 people's
        String favFoodRam = null;
        System.out.println("Fav food : " + favFoodRam);
        Integer ramMoney = 10000; // ram dont have any money


        if (ramMoney > 1000_000) {  // 0 > 1mil
            System.out.println("You are a million dollar man ");
        }


//        hire.displayDetails();

//        null.displayDetails();

        hire = new Employee();
//        hire.displayDetails();


        var obj = new NabilBankMobileAppServiceResponse(); // -->  NabilBankMobileAppServiceResponse obj = new NabilBankMobileAppServiceResponse();
        //
        NabilBankMobileAppServiceResponse obj3 = new NabilBankMobileAppServiceResponse();


    }
}
