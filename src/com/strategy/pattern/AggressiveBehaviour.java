package com.strategy.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class AggressiveBehaviour implements IBehaviour{

    @Override
    public int moveCommand() {
        System.out.println("agressive");
        return 1;
    }
}
