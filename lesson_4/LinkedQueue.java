package lesson_4;

import java.util.NoSuchElementException;

public class LinkedQueue<T> {
    private MyLinkedList<T> lq = new MyLinkedList<>();
    private int size;


    public void insert(T item) {
        lq.insertFirst(item);
        size++;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return lq.getLast();
    }

    public T remove() {
        T temp = peekFront();
        size--;
        lq.removeLast();
        return temp;
    }

    public boolean isEmpty(){
        return lq.isEmpty();
    }
}
