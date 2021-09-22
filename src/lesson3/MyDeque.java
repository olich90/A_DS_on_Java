// 1. Создать класс для реализации дека.

package lesson3;

import java.util.Arrays;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //        B
    //    E
    //1 5     8

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {
        return index - 1 < 0 ? list.length - 1 : (index - 1) % list.length;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }
        return list[begin];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty");
        }
        return list[prevIndex(end)];
    }

    public void insertRight(T item) {
        if (isFull()) {
            //Расширение массива***
            reCapacity(list.length * 3 / 2 + 1);
            //throw new RuntimeException("Queue isFull");

        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            //Расширение массива***
            reCapacity(list.length * 3 / 2 + 1);
            //throw new RuntimeException("Queue isFull");
        }
        size++;
        begin = prevIndex(begin);
        list[begin] = item;
    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        list[prevIndex(end)] = null;
        end = prevIndex(end);
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    // 4***. Реализовать метод увеличивающий массив в классе очередь.
    private void reCapacity(int newSize) {
        T[] temp = (T[]) new Object[newSize];

        System.arraycopy(list, begin, temp, 0, size - begin);
        System.arraycopy(list, 0, temp, size - begin, end);

        list = temp;
        begin = 0;
        end = size;
    }
}
