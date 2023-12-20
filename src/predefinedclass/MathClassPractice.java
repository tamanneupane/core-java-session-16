package predefinedclass;

public class MathClassPractice {

    public static void main(String[] args) {
        //Math math = new Math();

        double result = Math.sqrt(49);
        System.out.println(result);

        float absResult = Math.abs(-100.5f);
        System.out.println(absResult);

        double maxNumber = Math.max(10.0, 20.0);
        System.out.println(maxNumber);

        // 200,500, 600
        int maxThreeNumber = Math.max(600, Math.max(500, 200));
        System.out.println(maxThreeNumber);
    }
}
