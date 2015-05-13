package com.iterator.pattern;

/**
 * Created by wyr on 2015/5/13.
 */
public class List<E> extends AbstractList<E> {
    private Object[] objects;
    private int index;
    private  int capacity = 10;
    public List() {
        this.objects = new Object[capacity];
    }

    @Override
    public Iterator<E> createIterator() {
        return new ListIterator<>(this);
    }

    @Override
    public int count() {
        return index;
    }

    @Override
    public void append(E e) {
        objects[index++] = e;
    }

    @Override
    public void remove(E e) {
        objects[index--] = null;
    }

    @Override
    public E get(int index) {
        return (E)objects[index];
    }

    @Override
    public void setIndex(int index) {
        this.index = index;
    }
}
