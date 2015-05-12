package com.chain.responsibility;

/**
 * Created by wyr on 2015/5/12.
 */
public class ConcreteHandlerThree extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() == 0){
            System.out.println("=0");
        }else
            successor.handleRequest(request);
    }
}
