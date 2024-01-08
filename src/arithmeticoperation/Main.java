package arithmeticoperation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
//        byte num1 = 127; //  (-128 to 127)
//        short num2 = 24; //
//        int num3 = 21; //
//        long num4 = 34; //
//        float num5 = 26; //
//        double num6 = 27; //
//
//        int result1 = num1;//implicit type casting
//        int result2 = (int) num4;//explicit type casting
//        int result3 = (int) num4;//explicit type casting


        // Combining Assignment with Operators

        int num1 = 10;
//        num1 = num1 + 2;
//        = + - / *
        num1 += 2; // num1 = num1 +2
        num1 -= 2; // num1 = num1 -2
        num1 /= 2; // num1 = num1 /2
        num1 *= 2; // num1 = num1 *2


        int num2 = 0;
        num2++; // num2 = num2 + 1 // num2 += 1 // 1
//        System.out.println(num2);
        num2--; // num2 = num2 - 1 // num2 -= 1 //0
//        System.out.println(num2);


        int a = 10;
        int b = 2;
//        b = b + 1; // b+=1 // b++
        int result1 = a + b++; // a + b // 10 + 2 //12
        int result = a + ++b; // a + (b=b+1) // 10 + (3) //13
//        System.out.println(result);
//        System.out.println(b);

        int integerNumber = 1231231231;
        long longNumber = 1298317283781231233L;
//        BigInteger integer = BigInteger.valueOf(1000000000082374980L);
//        BigInteger integer1 = new BigInteger("23894728374092374092384902342342342342342342342348340928234523452345");
//
//        System.out.println(integer);
//        System.out.println(integer1);


        double floatNumber1 = 10.1f;
        double floatNumber2 = 10.2f;
        System.out.println(floatNumber1 + floatNumber2);

//        BigDecimal bigDecimalNumber1 = new BigDecimal("10.1");
//        BigDecimal bigDecimalNumber2 = new BigDecimal("10.2");
//        BigDecimal result3 = bigDecimalNumber2.add(bigDecimalNumber1);



        BigDecimal first = BigDecimal.valueOf(10.1);
        BigDecimal second = BigDecimal.valueOf(10.2);
        BigDecimal result3 = first.add(second);
//
        System.out.println(result3);


    }
}
