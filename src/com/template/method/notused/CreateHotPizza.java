package com.template.method.notused;

/**
 * Created by wyr on 2015/5/13.
 */
public class CreateHotPizza extends CreatePizza{
    @Override
    public void placeCondiment() {
        super.placeCondiment();//invoke super method may forget
        System.out.println("place hot");
    }
}
