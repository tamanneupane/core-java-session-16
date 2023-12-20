package inputandoutput;

import java.io.Console;

public class PasswordInput {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your username ?");
//        String username = scanner.nextLine();
//
//        System.out.println("What is you password ?");
//        String password = scanner.nextLine();

//        Console console = System.console();
//
//        String username = console.readLine("What is your username ? :");
//
//        char[] password = console.readPassword("What is you password ?: ");
//
//
//        if (username.equals("admin")) {
//            System.out.println("Welcome to the system.");
//        } else {
//            System.out.println("Sorry you credentials are wrong.");
//        }

        int age = 25;
        String name = "ashish";
        System.out.println("you name is " + name + " your age is " + age);
        System.out.printf("you name is %s  your age is %d", name, age);


    }
}
