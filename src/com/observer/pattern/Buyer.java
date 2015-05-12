package com.observer.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class Buyer implements  Observer{

    private Observable observable;

    public Buyer(Observable o) {
        this.observable = o;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observable) {
        if (observable instanceof  RedDress){
            needBuy();
        }
    }

    private void needBuy() {
        boolean isStock = ((RedDress)observable).isInStock();
        if (isStock == true){
            System.out.println("we should buy it");
        }
        else
            System.out.println("not buy it");
    }
}
