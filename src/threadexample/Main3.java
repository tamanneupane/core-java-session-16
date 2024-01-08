package threadexample;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Main3 {

    private static final Executor executor = Executors.newSingleThreadExecutor();
    private static final Logger logger = Logger.getLogger("Main3");

    public static void main(String[] args) throws InterruptedException {
        logger.info("started");

        executor.execute(Main3::sendEmail);
        executor.execute(Main3::sendEmail);
        executor.execute(Main3::sendEmail);
        executor.execute(Main3::sendEmail);

    }


    public static void sendEmail() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }

        logger.info("Sending email finished by thread : " + Thread.currentThread().getName());
    }
}
