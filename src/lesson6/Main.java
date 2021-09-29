package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map1 = new MyTreeMap<>();

        map1.put(5, "five");
        map1.put(4, "four");
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(6, "six");
        map1.put(7, "seven");
        //map1.put(0, "zero");


        System.out.println(map1.height());
        System.out.println(map1.size());
        System.out.println(map1.isBalanced());
//
//        System.out.println(map.get(4));
////        map.put(4, "four four");
//
//        System.out.println(map.get(4));
//        System.out.println(map.size());
//
//        System.out.println(map);
//
//        map.remove(1);
//        System.out.println(map);


        final int min = 10; // Минимальное число для диапазона
        int max = 75; // Максимальное число для диапазона
        max -= min;

        MyTreeMap<Integer, Integer> map = new MyTreeMap<>();

        for (int i = 0; i < 20/*100_000*/; i++) {


            map.put(i, ((int) (Math.random() * ++max)) + min);

        }
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.height());
        //System.out.println(map);


    }
}
//}

