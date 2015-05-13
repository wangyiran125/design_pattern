package com.iterator.pattern;

/**
 * Created by wyr on 2015/5/13.
 */
public class SkipList<E> extends AbstractList<E>{
    private Object[] objects;
    private int index;
    private  int capacity = 10;
    public SkipList() {
        this.objects = new Object[capacity];
    }

    @Override
    public Iterator<E> createIterator() {
        return new SkipOneListIterator<>(this);
    }

    @Override
    public int count() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
        E e = (E)objects[index];
        return  e;
    }
}
