package com.strategy.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class DefensiveBehaviour implements IBehaviour{
    @Override
    public int moveCommand() {
        System.out.println("defensive");
        return -1;
    }
}
