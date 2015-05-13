package com.template.method.used;

/**
 * Created by wyr on 2015/5/13.
 */
public class Test {
    public static void main(String[] args) {
        CreatePizza hotPizza = new CreateHotPizza();
        hotPizza.create();
        CreatePizza sweetPizza = new CreateSweetPizza();
        sweetPizza.create();
    }
}
