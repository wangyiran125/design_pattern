package com.bridge.notpattern;

/**
 * Created by wyr on 2015/6/5.
 */
public class Test {
    public static void main(String[] args) {
        BlueCircle blueCircle = new BlueCircle();
        blueCircle.draw();
        RedCircle redCircle = new RedCircle();
        redCircle.draw();

        BlueRectangle blueRectangle = new BlueRectangle();
        blueRectangle.draw();
        RedRectangle redRectangle = new RedRectangle();
        redRectangle.draw();
    }
}
