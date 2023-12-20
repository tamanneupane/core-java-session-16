package inputandoutput;

public class BlockedScope {
    public static void main(String[] args) {
        int age = 25;
        {
            int magicNumber = 7;

            System.out.println(magicNumber);
        }
        System.out.println(age);
    }

    public static void test() {
        int a = 999;
    }

}
