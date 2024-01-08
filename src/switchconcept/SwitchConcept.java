package switchconcept;

public class SwitchConcept {
    public static void main(String[] args) {
//        greet("ashish");
//        switchGreet("Wednesday");
//        switchGreet("ashish");
        greet("Wednesday");
        switchGreet("Wednesday");



    }

    public static void switchGreet(String day) {
        switch (day) {
            case "Sunday":
                System.out.println("Sunday is a weekend");
                break;
            case "Monday":
                System.out.println("Monday is a weekday");
                break;
            case "Tuesday":
                System.out.println("Tuesday is a weekday ");
                break;
            case "Wednesday":
                System.out.println("Wednesday is a weekday ");
                break;
            case "Thursday":
                System.out.println("Thursday is a weekday ");
                break;
            case "Friday":
                System.out.println("Friday is a weekday ");
                break;
            case "Saturday":
                System.out.println("Saturday is a weekend ");
                break;
            default:
                System.out.println("Sorry the day invalid");
                break;
        }

    }

    public static void greet(String day) {
        if (day.equals("Sunday")) {
            System.out.println("Sunday is a weekend ");
        } else if (day.equals("Monday")) {
            System.out.println("Monday is a weekday ");
        } else if (day.equals("Tuesday")) {
            System.out.println("Tuesday is a weekday ");
        } else if (day.equals("Wednesday")) {
            System.out.println("Wednesday is a weekday ");
        } else if (day.equals("Thursday")) {
            System.out.println("Thursday is a weekday ");
        } else if (day.equals("Friday")) {
            System.out.println("Friday is a weekday ");
        } else if (day.equals("Saturday")) {
            System.out.println("Saturday is a weekend ");
        } else {
            System.out.println("Sorry not a valid day");
        }


    }


}
