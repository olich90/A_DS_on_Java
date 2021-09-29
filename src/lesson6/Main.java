package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        MyTreeMap<Integer, String> map = new MyTreeMap<>();
//
//        map.put(5, "five");
//        map.put(4, "four");
//        map.put(1, "one");
//        map.put(2, "two");
//        map.put(3, "three");
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


        Random random = new Random();
        int countTree = 100_000;
        int balCount = 0;

        for (int i = 0; i < countTree; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int x = 0;
            while (map.height() < 6) {
                x = random.nextInt(201) - 100;
                map.put(x, x);
            }
            map.remove(x);
            if (map.isBalanced()) {
                balCount++;
            }
        }
        System.out.println("balCount " + balCount + " countTree " + countTree);
        System.out.println("balanced " + (double) balCount / countTree * 100 + " %");
        System.out.println("no balanced " + (double) (countTree - balCount) / countTree * 100 + " %");
    }
}
