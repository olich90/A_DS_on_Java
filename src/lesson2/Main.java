package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }

//        System.out.println(Arrays.toString(arr));

//        int[] a = {1, 2, 3};
//        int[] b = {4, 5, 6};
//
//        b = a;
//        a[1] = 77;
//        b[2] = 99;
//
//        System.out.println(Arrays.toString(a));

//        String[] str = {"qwe", "asd", "zxc"};
//
//        for (int i = 0; i < str.length; i++) {
//            str[i]+="!!!";
//        }
//        System.out.println(Arrays.toString(str));

//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 43, 3, 2, 4, 2, 4, 2, -21, 1));
//        System.out.println(list);
//        list.addAll(2, Arrays.asList(77, 88, 99, 33, 44));
//        list.remove((Integer) 2);

//        list.removeAll(Arrays.asList(2, 4));
//        list.removeIf(x -> x == 2);
//        list.removeIf(x -> x > 2);
//        list.removeIf(x -> x >= 10 && x <= 100);
//        list.removeIf(x -> x % 2 != 0);

//        list.replaceAll(x -> x * 2);
//        list.replaceAll(x -> x % 2 != 0 ? x * 2 : x);

//        System.out.println(list);

        MyArrayList<Integer> mal = new MyArrayList<>();
        mal.add(0);
        mal.add(1);
        mal.add(2);
        mal.add(3);
        mal.add(4);
        mal.add(5);
        mal.add(6);
        mal.add(7);
        mal.add(8);
        mal.add(9);
        //mal.add(10);

        try {
            mal.add(9, 10);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(mal);

        //mal.add(1, 77);


        //System.out.println(mal);

//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(6);
//        msal.add(16);
//        msal.add(3);
//        msal.add(7);
//        msal.add(5);
//
//        System.out.println(msal);
//        System.out.println(msal.binaryFind(7));

//        int n = 10;
//        Random random = new Random();
//        MyArrayList<Integer> mal = new MyArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            mal.add(random.nextInt(10));
//        }
//        System.out.println(mal);
////        mal.selectionSort();
////        mal.insertionSort();
//        mal.bubbleSort();
//        System.out.println(mal);

//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(2);
//        mal.add(4);
//        mal.add(7);
//        System.out.println(mal);
//        mal.add(1, 77);
//        System.out.println(mal);

//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(6);
//        msal.add(16);
//        msal.add(3);
//        msal.add(7);
//        msal.add(5);
//        msal.add(5);
//
//        System.out.println(msal);
////        System.out.println(msal.binaryFind(7));
//        System.out.println(msal.recBynaryFind(5));

//        int n = 100_000;
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (i * Math.random());
//            System.out.println(arr[i]);
//        }

/*
1. Создать массив большого размера (100000 элементов).
2. Заполнить массив случайными числами.
3. Проверить скорость выполнения каждой сортировки.
*/
//        int n = 100_000;
//        Random random = new Random();
//        MyArrayList<Integer> mal = new MyArrayList<>(n);
//        for (int i = 0; i < n; i++) {
//            mal.add(random.nextInt(n));
//        }

//        long startTime = System.currentTimeMillis();
//        mal.selectionSort(); // 16323ms
//        mal.insertionSort(); // 6661ms
//        mal.bubbleSort(); // 45913ms
//        mal.bubbleSortOptimized(); // 46386ms
//        System.out.println(mal);
        mal.quickSort(); // 86 ms  O(n log n)
//        System.out.println("Time of execution is " + (System.currentTimeMillis() - startTime) + "ms");

    }
}
