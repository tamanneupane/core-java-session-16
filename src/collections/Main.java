package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerLinkedList = new ArrayList<>(100_000);

        integerLinkedList.add(2);
        integerLinkedList.add(4);
        integerLinkedList.add(52);
        integerLinkedList.add(6);

//        System.out.println(integerLinkedList);
        integerLinkedList.add(2, 323);
//        System.out.println(integerLinkedList);

        List<Integer> arrayList = new LinkedList<>();

        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(52);
        arrayList.add(6);
        int[] arrys = new int[10_00000];
        int arry = arrys[99999];
//        System.out.println(arrayList);

        arrayList.add(2, 48);
//        System.out.println(arrayList);


        Stack<Integer> stackList = new Stack<>();
        stackList.push(7);
        stackList.push(6);
        stackList.push(5);

//        System.out.println(stackList);
//
//        System.out.println(stackList.pop());
//        System.out.println(stackList.pop());
//        System.out.println(stackList.pop());
//
//        System.out.println(stackList);

        Queue<Integer> integerQueue = new PriorityQueue<>();//
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(56);
        integerQueue.add(26);
        integerQueue.add(72);
        integerQueue.add(22);


//        System.out.println("FIRST QUEUE "+integerQueue.poll());
//        System.out.println("FIRST QUEUE "+integerQueue.poll());
//        System.out.println("FIRST QUEUE "+integerQueue.poll());
//        System.out.println("FIRST QUEUE "+integerQueue.poll());
//        System.out.println("FIRST QUEUE "+integerQueue.poll());
//        System.out.println("FIRST QUEUE "+integerQueue.poll());
//        System.out.println("---------------------------------");
        Queue<Integer> integerQueue2 = new PriorityQueue<>((o1, o2) -> o2 - o1);
//        ArrayList<>
        integerQueue2.add(1);
        integerQueue2.add(2);
        integerQueue2.add(56);
        integerQueue2.add(26);
        integerQueue2.add(72);
        integerQueue2.add(22);

//        System.out.println(integerQueue);

//        System.out.println("SECOND QUEUE "+integerQueue2.poll());
//        System.out.println("SECOND QUEUE "+integerQueue2.poll());
//        System.out.println("SECOND QUEUE "+integerQueue2.poll());
//        System.out.println("SECOND QUEUE "+integerQueue2.poll());
//        System.out.println("SECOND QUEUE "+integerQueue2.poll());
//        System.out.println("SECOND QUEUE "+integerQueue2.poll());

//        System.out.println(integerQueue);
//        System.out.println(integerQueue);

//
//        integerQueue.offer(999);
//
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());


        //TODO:priority queue

        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(2);
        arrayDeque.offer(5);
        arrayDeque.offer(6);
        arrayDeque.offer(9);

//
//        System.out.println(arrayDeque);
//
//
//        System.out.println(arrayDeque.poll());
//        System.out.println(arrayDeque.poll());
//        System.out.println(arrayDeque.poll());
//        System.out.println(arrayDeque.poll());

//        System.out.println(arrayDeque);
//
//
//        System.out.println("FIRST :" +arrayDeque.peekFirst());
//        System.out.println("LAST :" +arrayDeque.peekLast());
//
//        System.out.println(arrayDeque.pollFirst());
//        System.out.println(arrayDeque.pollLast());
//
//        System.out.println(arrayDeque);


        Set<String> classOneStudents = new HashSet<>();

        classOneStudents.add("ashish");
        classOneStudents.add("ram");
        classOneStudents.add("hari");
        classOneStudents.add("sam");
        classOneStudents.add("ravi");
        String a = "ashish";
        String b = "shiva";
//
//        System.out.println(a.equals(b));
//        System.out.println(classOneStudents.contains("shiva"));

        List<String> classOneStudentsArrayList = new ArrayList<>();
        classOneStudentsArrayList.add("ashish");
        classOneStudentsArrayList.add("ram");
        classOneStudentsArrayList.add("hari");
        classOneStudentsArrayList.add("sam");
        classOneStudentsArrayList.add("ravi");

//        System.out.println(classOneStudentsArrayList.contains("hari"));
        NavigableSet<Integer> integerSet = new TreeSet<>((o1, o2) -> o2 - o1);
        integerSet.add(80);
        integerSet.add(365);
        integerSet.add(5);
//
//        System.out.println(integerSet);
//
//        System.out.println(integerSet.add(80));
//
//        System.out.println(integerSet);


        Map<String, Integer> map = new TreeMap<>();

        map.put("ram", 90);
        map.put("ashish", 50);
        map.put("ravi", 40);
        map.put("hari", 70);
        map.put("cat", 70);

        map.put("ashish", 100);
//        map.putIfAbsent("ashish",100);

//        System.out.println(map);
//        for (Map.Entry<String, Integer> mapEntry : map.entrySet()) {
//            System.out.println(mapEntry.getKey() + " ==== " + mapEntry.getValue());
//        }
//      map.forEach((k,v)-> System.out.println(k +  " ==== "+v));


        test("ashish"); // ----> 1sec
        test("ram");
        test("sam");
        test("hari");
        test("ravi");
        // 5sec

        test("ashish"); // ----> 1sec ,5 thread
        test("ram");
        test("sam");
        test("hari");
        test("ravi");
        //1


    }

    //WAP to check if duplicate letter are present in the string
    public static void test(String s) {
        //s -> "asdfkjaisjkdja"
        //s -> "ram"

        HashSet<Character> hashSet = new HashSet<>();

        for (Character character : s.toCharArray()) {
            if (!hashSet.add(character)) {
                System.out.println("Contains duplicate");
                return;
            }
        }
        System.out.println("Dose not contain duplicate");
    }
}


// 5->6->7
//
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("ashish");
//        stringList.add("ram");
//        stringList.add("sam");
//        stringList.add("elon");

//        arrayList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println(arrayList);
//
//        arrayList.sort((o1, o2) -> {
//
//            return o1 - o2;
//        });
//
//
//        System.out.println(arrayList);
//
////        arrayList.clear();
//        System.out.println(arrayList);
//        for (Integer i : arrayList) {
//            System.out.println(i);
//        }
//->

//        arrayList.forEach(integer -> System.out.println(integer));


//        arrayList.remove(5);

//
//        System.out.println(stringList.contains("elon"));
//
//        System.out.println(stringList.get(0));


//        stringList.set(1,"hari");
//        System.out.println(stringList);
//    }
//}
//        ArrayList<Integer> arrayList = new ArrayList<>();
//       var arrayList = new ArrayList<>();
//       Iterable<Integer> arrayList = new ArrayList<>();
//       Collection<Integer> arrayList = new ArrayList<>();
