package com.observer.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public interface Observable {
    public void  addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
