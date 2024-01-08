package excception;

import object.Person;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static final Logger logger = Logger.getLogger("excception.Main");

    public static void main(String[] args) {
//        Logger.getGlobal().info("Application Started");
        logger.info("Application started");

        readFile();
        try {
            processingLogicTwo("Ashish");
            processingLogicTwo("Avi");
            processingLogicTwo("1234");
            processingLogicTwo("Prabesh");
        } catch (NameFormatException exception) {
            System.out.println(exception.getMessage());
        } catch (NameContainsNumber exception) {
//            Logger.getGlobal().log(Level.WARNING, exception.getMessage());
            logger.severe(exception.getMessage());
            return;
        }


        try {
            processingLogic();
        } catch (ArithmeticException exception) {
            System.out.println("Sorry cannot process the file");
        }


        saveFile();
    }

    private static void processingLogicTwo(String name) throws NameFormatException, NameContainsNumber {
        List<String> numberList = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");


        for (Character character : name.toCharArray()) {
            if (numberList.contains(character.toString())) {
                throw new NameContainsNumber("sorry the name " + name + " contains number");
            }
        }

        if (!name.toLowerCase().startsWith("a")) {
            throw new NameFormatException("Cannot save file with name " + name);
        }

        System.out.println("Processing name : " + name);
    }

    private static void processingLogic() throws ArithmeticException {
        int a = 100;
        int b = 10;
        int fileSize = a / b;
        System.out.println("Processing the file with size of " + fileSize);
    }

    private static void saveFile() {
        System.out.println("Saving the file");
    }

    private static void readFile() {
        System.out.println("Reading from a file");
    }


}
//        try {
//            Socket socket = new Socket();
//            socket.connect(null);
//        } catch (IOException | IllegalArgumentException exception) {
//            System.out.println("Sorry something went wrong,Please try again later");
//            return;
////            System.out.println("Some error happened during socket connection");
//        }
//        try {
//            processingLogic();
//        } catch (ArithmeticException exception) {
//            System.out.println("Exception occurred : " + exception.getMessage());
//        }
//        int a = 100;
//        int b = 0;
//
//
////        assert b != 0 : "B should be non zero";
//
//
//        int fileSize = a / b;
