package com.iterator.pattern;

/**
 * Created by wyr on 2015/5/13.
 */
public interface Iterator<E> {
    public E first();
    public E next();
    public boolean isDone();
    public E currentItem();
}
