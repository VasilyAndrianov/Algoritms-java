package lesson_8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int x =  Integer.MIN_VALUE;
//        System.out.println(x);
//        System.out.println(Math.abs(x));
//        int x = 0x7FFFFFFF;
//        System.out.println(x);

//        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(7);
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
//        map.put(4, "four");
//        map.put(5, "five");
//        map.put(6, "six");
//        System.out.println(map.contains(2));
//        System.out.println(map.get(2));
//        System.out.println("map size - " + map.size());
//        System.out.println(map);
//        System.out.println("remove - " + map.remove(4));
//        System.out.println("remove - " + map.remove(6));
//        System.out.println("map size - " + map.size());
//        System.out.println(map);

//        Random random = new Random();
//        for (int i = 0; i < 5; i++) {
//            map.put(random.nextInt(100), "");
//        }

//        System.out.println(map);

        LinearProbingHashMap<Integer, String> map = new LinearProbingHashMap<>(7);
//
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");

//        map.put(2, "two");
//        System.out.println(map.contains(2));
        System.out.println(map.get(2));
        System.out.println(map);

        map.remove(3);
        System.out.println(map);
        map.put(3, "three");
        System.out.println(map);
//
//        map.put(11, "11");
//        map.put(10, "");
//        System.out.println(map);
//        map.put(9, "");
//        System.out.println(map);
    }
}

