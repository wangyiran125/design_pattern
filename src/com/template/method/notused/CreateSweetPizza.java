package com.template.method.notused;

/**
 * Created by wyr on 2015/5/13.
 */
public class CreateSweetPizza extends CreatePizza{
    @Override
    public void placeCondiment() {
        super.placeCondiment();//easy to forget it
        System.out.println("place sweet");
    }
}
