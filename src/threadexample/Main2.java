package threadexample;

public class Main2 {
    static Integer account1 = 100;
    static Integer account2 = 500;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (account1) {
                System.out.println("Thread 1 holding account 1 !");
                try {Thread.sleep(100);} catch (Exception e) {}

                System.out.println("Thread 1 waiting fo account2");
                synchronized (account2) {
                    System.out.println("Thread 1 holding account1 and account 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (account2) {
                System.out.println("Thread 2 holding account 2 !");
                try {Thread.sleep(100);} catch (Exception e) {}

                System.out.println("Thread 2 waiting fo account1");
                synchronized (account1) {
                    System.out.println("Thread 2 holding account1 and account 2");
                }
            }
        });


        t1.start();
        t1.join();
        t2.start();
    }


}
//
//        Thread thread1 = new Thread(Main2::increaseA, "t1-001");
//        Thread thread2 = new Thread(Main2::increaseA, "t2-002");
//        Thread thread3 = new Thread(Main2::increaseA, "t3-003");
//        Thread thread4 = new Thread(Main2::increaseA, "t4-004");
//        Thread thread5 = new Thread(Main2::increaseA, "t5-005");
//        Thread thread6 = new Thread(Main2::increaseA, "t6-006");
//        Thread thread7 = new Thread(Main2::increaseA, "t7-007");
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//        thread7.start();
//    }
//
//    public static  synchronized void increaseA() {
//        a++;
//        System.out.println(a);
//    }
//}
