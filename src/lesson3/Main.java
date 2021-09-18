package lesson3;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> myStack = new MyStack<>();
//
//        myStack.push(5);
//        myStack.push(2);
//        myStack.push(9);
//        myStack.push(1);
//        myStack.push(4);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(myStack.pop());
//        }

        // 2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
        MyStack<String> myStack = new MyStack<>();
        myStack.push("т");
        myStack.push("e");
        myStack.push("в");
        myStack.push("и");
        myStack.push("р");
        myStack.push("П");

        for (int i = 0; i < 6; i++) {
            System.out.print(myStack.pop());
        }

//        Expression e = new Expression("()+{}+[{}]");
//        System.out.println(e.checkBracket());


//        MyQueue<Integer> queue = new MyQueue<>(5);
//
//        queue.insert(3);
//        queue.insert(2);
//        queue.insert(7);
//        queue.insert(4);
//        queue.insert(5);
//        queue.insert(6);
//
//        for (int i = 0; i < 6; i++) {
//            System.out.println(queue.remove());
//        }

//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//
//        mpq.insert(5);
//        mpq.insert(2);
//        mpq.insert(20);
//        mpq.insert(21);
//        mpq.insert(4);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(mpq.remove());
//        }

//        MyDeque<Integer> deque = new MyDeque<>(5);
//
//        deque.insertLeft(2);
//        deque.insertLeft(6);
//        deque.insertLeft(4);
//        deque.insertLeft(7);
//
//
//        for (int i = 0; i < 2; i++) {
//            System.out.print(deque.removeLeft() + " ");
//        }
//
//        deque.insertRight(8);
//        System.out.println();
//        System.out.println(deque.peekRight());
//
//        deque.insertRight(1);
//        System.out.println(deque.peekRight());
//
//        deque.insertRight(2);
//        System.out.println(deque.peekRight());
//
//        deque.insertLeft(99);
//        System.out.println(deque.peekLeft());

    }
}
