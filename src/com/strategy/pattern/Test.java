package com.strategy.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class Test {
    public static void main(String[] args) {
        Robot r1 = new Robot("r1");
        Robot r2 = new Robot("r2");
        Robot r3 = new Robot("r3");
        r1.setBehaviour(new AggressiveBehaviour());
        r2.setBehaviour(new DefensiveBehaviour());
        r3.setBehaviour(new NormalBehaviour());
        r1.move();
        r2.move();
        r3.move();
    }
}
