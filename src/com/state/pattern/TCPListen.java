package com.state.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public class TCPListen implements TCPState{
    @Override
    public void open() {
        System.out.println("listen open");
    }

    @Override
    public void close() {
        System.out.println("listen close");
    }

    @Override
    public void acknowledge() {
        System.out.println("listen close");
    }
}
