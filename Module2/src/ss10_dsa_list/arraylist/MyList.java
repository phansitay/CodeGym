package ss10_dsa_list.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index : " + index + "Size : " + size);
        }
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        E e = (E) elements[index];
        checkIndex(index);
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return e;
    }

    public void output() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i] + " ");
        }
    }

    public int size() {
        return size;
    }

    public E clone() {
        Object elementsClone[] = new Object[size];
        for (int i = 0; i < size; i++) {
            elementsClone[i] = elements[i];
        }
        return (E) elementsClone;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E o) {
        ensureCapa();
        elements[elements.length - 1] = o;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = size += minCapacity;
        E newElements[] = (E[]) new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = (E) elements[i];
        }
        elements = newElements;
        System.out.println(elements.length);
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
