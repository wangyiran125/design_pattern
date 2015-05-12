package com.observer.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class Test {
    public static void main(String[] args) {
        RedDress o = new RedDress();
        Buyer buyer = new Buyer(o);
        o.setInStock(true);
    }
}
