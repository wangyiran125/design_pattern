package com.template.method.used;

/**
 * Created by wyr on 2015/5/13.
 */
public class CreateHotPizza extends CreatePizza {
    @Override
    protected void addYourFavoriteCondiment() {
        System.out.println("place hot");
    }
}
