package com.strategy.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class TestNotUsePattern {
    public static void main(String[] args) {
        Robot r1 = new Robot("r1");
        if (r1.getName() == "r1") {
            System.out.println("agressive");
        }else if (r1.getName()=="r2"){
            System.out.println("defensive");
        }else if (r1.getName() == "r3"){
            System.out.println("normal");
        }
    }
}
