package com.chain.of.responsibility.pattern;

/**
 * Created by wyr on 2015/6/5.
 */
public interface CashHandler {
    public void setNext(CashHandler cashHandler);
    public void handleRequest(Account account);
}
