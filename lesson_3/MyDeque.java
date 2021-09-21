package lesson_3;

import java.util.NoSuchElementException;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int tail;

    public MyDeque(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }


    public void insertLeft(T item) throws IllegalStateException {
        if (isFull()) {
            reCapacity(list.length * 2);
        }
        size++;
        list[tail] = item;
        tail = nextIndex(tail);
    }

    public void insertRight(T item) throws IllegalStateException {
        if (isFull()) {
            reCapacity(list.length * 2);
            throw new IllegalStateException("Full");
        }
        size++;
        list[priorIndex(begin)] = item;
        begin = priorIndex(begin);
    }


    public T peekRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }


    public T peekLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[priorIndex(tail)];
    }


    public T removeRight() {
        T temp = peekRight();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        list[priorIndex(tail)] = null;
        tail = priorIndex(tail);
        return temp;
    }


    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int priorIndex(int index) {
        if (index == 0) {
            return list.length - 1;
        } else {
            return index - 1;
        }
    }


    private void reCapacity(int newCapacity){
        T[] temp = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, temp, 0, size);
        list = temp;
    }

}