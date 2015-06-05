package com.bridge.pattern;

/**
 * Created by wyr on 2015/6/5.
 */
public class Circle {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("draw"+color.getColorValue()+"circle");
    };
}
