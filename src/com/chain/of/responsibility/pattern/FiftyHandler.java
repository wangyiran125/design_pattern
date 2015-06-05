package com.chain.of.responsibility.pattern;

/**
 * Created by wyr on 2015/6/5.
 */
public class FiftyHandler implements CashHandler {
    private CashHandler next;
    @Override
    public void setNext(CashHandler cashHandler) {
        if (next == null){
        next = cashHandler;
        }else
            next.setNext(cashHandler);
    }

    @Override
    public void handleRequest(Account account) {
        Integer cashNum = account.getCashNum(CashType.FIFTY);
        if (cashNum != null && cashNum > 0){
            System.out.println("give you onehundred "+cashNum);
        }
        if (next != null){
            next.handleRequest(account);
        }
    }
}
