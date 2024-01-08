package loop;

public class Main {
    public static void main(String[] args) {
        //loop -> repeat the logic n number of time
        //while loop
        //break, continue

        //wap for multiplication table of 10

//        int number = 10;
//        int counter = 1;
//        while (counter < 11) {
//            System.out.printf("%d * %d = %d", number, counter, (number * counter));
//            System.out.println(""); //new line
//            counter++;
//        }

//        int loopCounter = 1;
//        do {
//            System.out.println("loop ran  " + loopCounter +" times");
//            loopCounter++;
//        } while (loopCounter < 11);//11<11(false)


//        while (loopCounter<11){
//            System.out.println(9*loopCounter);
//            loopCounter++;
//        }

//        for (int i = 9; i > 0; i--) {
//            System.out.println(i);
//        }


        for (int i = 1; i < 10; i++) {
            System.out.println("I am loop " + i);

            if (i == 2 || i ==7) {
                continue;
            }

            System.out.println("hello ashish from loop " + i);

        }


    }
}
