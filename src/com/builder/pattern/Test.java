package com.builder.pattern;

/**
 * Created by wyr on 2015/6/5.
 */
public class Test {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12).bacon(false).cheese(true).pepperoni(false).build();
    }
}
