package com.strategy.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class NormalBehaviour implements IBehaviour{
    @Override
    public int moveCommand() {
        System.out.println("normal");
        return 0;
    }
}
