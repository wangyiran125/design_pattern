package com.builder.pattern;

/**
 * Created by wyr on 2015/6/5.
 */
//explain http://stackoverflow.com/questions/328496/when-would-you-use-the-builder-pattern
    //for custom constructor with  4 or 5 parameters
public class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    public Pizza(Builder builder) {
        size = builder.size;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        bacon = builder.bacon;
    }

    public static class Builder{
       //required
       private final int size;
       //optional
       private boolean cheese = false;
       private boolean pepperoni = false;
       private boolean bacon = false;

       public Builder(int size) {
           this.size = size;
       }
       public Builder cheese(boolean value){
           cheese = value;
           return this;
       }
       public Builder pepperoni(boolean value){
           pepperoni = value;
           return this;
       }
       public Builder bacon(boolean value){
           bacon = value;
           return this;
       }
       public Pizza build(){
           return new Pizza(this);
       }
   }
}
