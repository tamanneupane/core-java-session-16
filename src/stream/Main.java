package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        List<Integer> integerList = List.of(24,51,35);

//        Optional<Integer> max = integerList.stream()
//                .max((a, b) -> a - b);
//                .max((a, b) -> b - a);

//        [24,35,51]
//        [51,35,24]

//        System.out.println(max.get());
//        int max = 0;
//        for (Integer number : integerList) {
//            max = Math.max(number, max);
//        }
//        System.out.println(max);

//        List<Integer> list = integerList.stream()
//                .filter(number -> number > 10)
//                .map(number -> number * 2)
//                .collect(Collectors.toList());
//
//        List<Integer> evenList = integerList.stream()
//                .filter(integer -> integer % 2 != 0)
//                .collect(Collectors.toList());

//        System.out.println(evenList);


        //        List<Integer> integerAboveNumber10 = integerList.stream()

//                .filter(number -> number > 10)
//                .filter(number -> number > 80)
//                .collect(Collectors.toList());
//        System.out.println(integerAboveNumber10);
//        for (Integer number : integerList) {
//            if (number > 10) {
//                integerAboveNumber10.add(number);
//            }
//        }
//        List<Integer> integerList = List.of(1, 2, 5, 6, 3, 8, 4);
//
//        System.out.println(integerList);
//
//
//        List<Integer> sortedList = integerList.stream()
//                .sorted((o1, o2) -> o2-o1)
//                .collect(Collectors.toList());
//
//        System.out.println(sortedList);
//        List<Integer> list1 = List.of(1, 2, 3);
//        List<Integer> list2 = List.of(4, 5, 6);
//        List<Integer> list3 = List.of(7, 8, 9);
//
//        List<List<Integer>> listOfNumber = List.of(list1, list2, list3);
//        System.out.println(listOfNumber);
//        List<Integer> integerList = listOfNumber.stream()
//                .flatMap(e -> e.stream())
//                .map(e->e*2)
//                .collect(Collectors.toList());
//
//        System.out.println(integerList);
        List<Integer> integerList = List.of(1, 2, 5, 6, 3, 8, 4, 1, 4, 3, 5, 1, 1, 1, 1, 1, 6, 6, 6, 8, 8, 8);

//        System.out.println(integerList);

//        List<Integer> distinct = integerList
//                .stream()
//                .distinct()
//                .collect(Collectors.toList());


//        List<Integer> distinct = integerList
//                .stream()
//                .distinct()
//                .peek(System.out::print)
//                .collect(Collectors.toList());


//        System.out.println(distinct);


//        long distinctElementCount = integerList.stream()
//                .distinct()
//                .count();
//
//        System.out.println(distinctElementCount);


        List<String> stringList = List.of("ashish", "ram", "ravi");


        stringList.stream().forEach(e -> System.out.println(e));

        stringList.forEach(e -> System.out.println(e));


//        boolean areAllNameStartingWithLetterA = stringList.stream()
//                .anyMatch(e->e.startsWith("a"));
//
//        System.out.println(areAllNameStartingWithLetterA);

    }

}
