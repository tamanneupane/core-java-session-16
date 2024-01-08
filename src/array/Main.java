package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //  jan 1  -- dec 31 (365)

        int Jan1 = 500;
        int Jan2 = 100;
        int Jan3 = 300;
        int Jan4 = 1000;
        int Jan5 = 200;
        int Jan6 = 50000;
//        System.out.println(Jan6+Jan2+Jan2);

//        int[] expenses2023 = new int[6];//(6 here is size of array)
        int[] expenses2023 = new int[366];//(5 here is size of array)

        expenses2023[0] = 500;
        expenses2023[1] = 400;
        expenses2023[2] = 600;
        expenses2023[3] = 200;
        expenses2023[4] = 500;
        expenses2023[5] = 23;
        expenses2023[365] = 234;


        int score1 = 72;
        int score2 = 73;
        int score3 = 33;

        int[] scores = new int[100];//

        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 70;
        scores[3] = 80;
        scores[4] = 86;
        scores[5] = 78;
        scores[6] = 79;

//        System.out.println(average(scores));


        String studentName1ClassOne = "ashish";
        String studentName2ClassOne = "ram";
        String studentName3ClassOne = "sam";

        String[] studentNameInClassOne = new String[3];
        studentNameInClassOne[0] = "ashish";
        studentNameInClassOne[1] = "ram";
        studentNameInClassOne[2] = "sam";

//        System.out.println(studentName1ClassOne);
//        System.out.println(studentName2ClassOne);
//        System.out.println(studentName3ClassOne);

        for (String name : studentNameInClassOne) {
//            System.out.println(name);
        }

        int[] smallPrimes = new int[10];
        smallPrimes[0] = 3;
        smallPrimes[1] = 5;
        smallPrimes[2] = 7;

//        int[] luckyNumbers = smallPrimes;
        int[] luckyNumbers = Arrays.copyOf(smallPrimes, smallPrimes.length);
//        luckyNumbers[5] = 12; // now smallPrimes[5] is also 12
        luckyNumbers[5] = 12; // now smallPrimes[5] is also 12

//        System.out.println(smallPrimes[5]);
//        System.out.println(luckyNumbers[5]);


        int[] youtubeChannelLikeCount = new int[]{1, 4, 6, 700, 2, 5, 7, 14, 6, 25, 27}; //1k , 4k

        System.out.println(youtubeChannelLikeCount[0]);
        System.out.println(youtubeChannelLikeCount[youtubeChannelLikeCount.length - 1]);


        System.out.println("After sorting");

        Arrays.sort(youtubeChannelLikeCount);//sort

        System.out.println(youtubeChannelLikeCount[0]);
        System.out.println(youtubeChannelLikeCount[youtubeChannelLikeCount.length - 1]);


    }

    @Deprecated
    public static float average(int[] scores) {

        int total = 0;

//        for (int i = 0; i < scores.length; i++) {  // 0 -- 6 ( scores.length = 7 )
//            total = total + scores[i];
//        }
        int counter = 0;
        for (int score : scores) {
            total = total + score;
            if (score != 0) {
                counter++;
            }
        }

        return (float) total / counter;

//        return (float) (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / 5;
    }
}
