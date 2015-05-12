package com.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyr on 2015/5/12.
 */
public class RedDress implements Observable{

    private List<Observer> users = new ArrayList<>();
    private boolean inStock = true;

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        users.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        users.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer user : users){
            user.update(this);
        }
    }
}
