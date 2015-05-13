package com.iterator.pattern;

/**
 * Created by wyr on 2015/5/13.
 */
public class ListIterator<E> implements Iterator<E> {
    private AbstractList<E> list;
    private int index=0;

    public ListIterator(AbstractList<E> list) {
        this.list = list;
    }

    @Override
    public E first() {
        return list.get(0);
    }

    @Override
    public E next() {
        return list.get(index++);
    }

    @Override
    public boolean isDone() {
        if (list.get(index) == null){
            return false;
        }else
        return true;
    }

    @Override
    public E currentItem() {
        return list.get(index);
    }
}

