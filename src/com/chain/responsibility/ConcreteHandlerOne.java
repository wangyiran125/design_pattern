package com.chain.responsibility;

/**
 * Created by wyr on 2015/5/11.
 */
public class ConcreteHandlerOne extends Handler{

    @Override
    public void handleRequest(Request request) {
        if (request.getValue() < 0){
            System.out.println("<0");
        }else {
            successor.handleRequest(request);
        }
    }
}
