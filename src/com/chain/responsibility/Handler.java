package com.chain.responsibility;

/**
 * Created by wyr on 2015/5/11.
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
