package com.builder.notpattern;

/**
 * Created by wyr on 2015/6/5.
 */
//explain http://stackoverflow.com/questions/328496/when-would-you-use-the-builder-pattern
public class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public Pizza(boolean bacon) {
        this.bacon = bacon;
    }

    public Pizza(boolean bacon, boolean cheese) {
        this.bacon = bacon;
        this.cheese = cheese;
    }

    public Pizza(boolean bacon, boolean cheese, boolean pepperoni) {
        this.bacon = bacon;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
    }

    public Pizza(boolean bacon, boolean cheese, boolean pepperoni, int size) {
        this.bacon = bacon;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.size = size;
    }
}
