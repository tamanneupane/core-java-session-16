package string.builder;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Ignore this block
        long start = System.currentTimeMillis();
        //--------------------------------------------


        concatString("random");

        //Ignore this block
        long end = System.currentTimeMillis() - start;
        System.out.println("Method took " + end / 1000 + " second to execute");
        //--------------------------------------------
    }
//
//    public static String concatString(String name) {
//        StringBuilder result = new StringBuilder(name);
//        for (int i = 0; i < 100_000; i = i + 1) {
//            result.append("ashish");
//        }
//        return result.toString();
//    }
    public static String concatString(String name) {
        for (int i = 0; i < 100_000; i = i + 1) {
            name = name + "ashish";
        }
        return name;
    }


}
