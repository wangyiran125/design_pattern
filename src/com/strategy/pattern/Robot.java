package com.strategy.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class Robot {
    private IBehaviour behaviour;
    private  String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move(){
        System.out.println("current movement");
        behaviour.moveCommand();
    }
}
