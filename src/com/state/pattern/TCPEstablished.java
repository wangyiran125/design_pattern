package com.state.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class TCPEstablished implements TCPState{
    @Override
    public void open() {
        System.out.println("established open");
    }

    @Override
    public void close() {
        System.out.println("established close");
    }

    @Override
    public void acknowledge() {
        System.out.println("established acknowledge");
    }
}
