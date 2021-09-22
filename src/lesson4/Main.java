package lesson4;

import lesson3.MyQueue;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        LinkedStack<Integer> ls = new LinkedStack<>();
//
//        ls.push(1);
//        ls.push(2);
//        ls.push(3);
//        ls.push(4);
//
//        System.out.println(ls);


        LinkedQueue<Integer> lq = new LinkedQueue<>();

        lq.insert(1);
        lq.insert(2);
        lq.insert(3);
        lq.insert(4);

        //System.out.println(lq);

        for (int i = 0; i < 4; i++) {
            //System.out.println(lq.peekFront());
            System.out.println(lq.remove());
        }

        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(15);
        mll.insertFirst(35);
        mll.insertFirst(25);
        mll.insertFirst(35);

        System.out.println(mll);

        System.out.println(mll.indexOf(35));
/*
//        System.out.println(mll.removeFirst());

        System.out.println(mll);

        mll.insertLast(2);
        mll.insertLast(22);

        System.out.println(mll);

        mll.insert(2, 777);
        System.out.println(mll);
//        System.out.println(mll.removeFirst());
//        System.out.println(mll);
//        System.out.println(mll.removeLast());
//        System.out.println(mll);

        mll.insert(2, 111);
        mll.insert(2, 22);
        System.out.println(mll);
//
        System.out.println(mll.remove(22));
        System.out.println(mll);

        for (Integer x : mll) {
            System.out.println(x);
        }

 */
    }
}
