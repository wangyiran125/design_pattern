package com.chain.responsibility;

/**
 * Created by wyr on 2015/5/12.
 */
public class Test {
    public static void main(String[] args){
        Handler handler1 = new ConcreteHandlerOne();
        Handler handler2 = new ConcreteHandlerTwo();
        Handler handler3 = new ConcreteHandlerThree();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler1.handleRequest(new Request(-1, "a"));
        handler1.handleRequest(new Request(0,"b"));
        handler1.handleRequest(new Request(1,"c"));
    }
}
