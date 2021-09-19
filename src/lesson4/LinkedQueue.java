// 1. Реализовать очередь используя MyLinkedList()
package lesson4;

public class LinkedQueue<T> {
    private MyLinkedList<T> list;

    public LinkedQueue() {
        list = new MyLinkedList<>();
    }

    public void insert(T item) {
        list.insertFirst(item);
    }

    public T remove() {
        return list.removeLast();
    }

    public T peekFront() {
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
