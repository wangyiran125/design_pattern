package com.template.method.notused;

/**
 * Created by wyr on 2015/5/13.
 */
public class CreatePizza {
    public void bake(){
        System.out.println("bake");
    }

    public void placeVegetable(){
        System.out.println("add vegetable");
    }

    public void placeCondiment(){
        System.out.println("place salt");
    };

    public void create(){
        placeVegetable();
        placeCondiment();
        bake();
    }
}
