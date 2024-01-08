package threadexample;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
//
//
//        Thread thread1 = new Thread(Main::performancetest, "t1-001");
//        Thread thread2 = new Thread(Main::performancetest, "t2-002");
//        Thread thread3 = new Thread(Main::performancetest, "t3-003");
//
//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
//        System.out.println(thread3.getPriority());
//
//
//        thread1.setPriority(Thread.MAX_PRIORITY);
//        thread2.setPriority(Thread.MIN_PRIORITY);
//        thread3.setPriority(Thread.NORM_PRIORITY);


//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
//        System.out.println(thread3.getPriority());
//
//        thread1.start();
//        thread2.start();
//        thread3.start();




//
//        Thread t1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//        t1.start();
//
//        Thread.sleep(2000);
//
//        t1.interrupt();
//        t1.setDaemon(true);
//        System.out.println(t1.isDaemon());
//
////        Thread thread1 = new Thread(Main::performancetest);
////        System.out.println(thread1.getState());
////
////        thread1.start();
////        System.out.println(thread1.getState());
////
////        thread1.join();
////        System.out.println(thread1.getState());
//        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Took " + (System.currentTimeMillis() - start) / 1000 + " sec to execute");
    }


    public static void performancetest() {
//        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(50);
//            } catch (Exception exception) {
//            }
//        }
        System.out.println("Thread name : " + Thread.currentThread().getName());


//        System.out.println("Performance test completed.");
    }
}
//        Thread thread = new Thread(() -> performancetest());
//        Thread thread2 = new Thread(Main::performancetest,"t2-002");
//        Thread thread3 = new Thread(Main::performancetest,"t3-003");

//        thread2.start();
//        thread3.start();


//        thread2.join();
//        thread3.join();