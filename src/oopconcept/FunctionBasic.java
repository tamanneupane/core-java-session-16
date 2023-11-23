package oopconcept;

public class FunctionBasic {

    public static void main(String[] args) {

        FunctionBasic fb = new FunctionBasic();

        int a = 7;
        int b = 3;
        int result1 = fb.add(a,b);
        System.out.println(result1);

        a = 5;
        b = 4;
        int result2 = fb.add(a,b);
        System.out.println(result2);
    }

    public int add(int x, int y){
        int result = x + y;
        return result;
    }

    public int subtract(int x, int y){
        int result = x - y;
        return result;
    }

    public int multiply(int x, int y){
        int result = x * y;
        return result;
    }


}
