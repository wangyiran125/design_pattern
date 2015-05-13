package com.iterator.pattern;

/**
 * Created by wyr on 2015/5/13.
 */
public abstract class AbstractList<E> {
    public abstract Iterator<E> createIterator();

    public abstract int count();

    public abstract void append(E e);

    public abstract void remove(E e);

    public abstract E get(int index);

    public abstract void setIndex(int index);
}
