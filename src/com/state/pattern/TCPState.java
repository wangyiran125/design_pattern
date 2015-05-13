package com.state.pattern;

/**
 * Created by wyr on 2015/5/12.
 */
public interface TCPState {
    public void open();
    public void close();
    public void acknowledge();
}
