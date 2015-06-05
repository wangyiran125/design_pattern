package com.chain.of.responsibility.notpattern;

/**
 * Created by wyr on 2015/6/5.
 */
public class BigHandlerCash {
    public void handlerRequest(Account account){
        //couple..
        Integer cashNum = account.getCashNum(CashType.FIFTY);
        if (cashNum != null && cashNum > 0){
            System.out.println("give you onehundred "+cashNum);
        }
        Integer cashNum2 = account.getCashNum(CashType.ONE);
        if (cashNum2 != null && cashNum2 > 0){
            System.out.println("give you one "+cashNum2);
        }
        Integer cashNum3 = account.getCashNum(CashType.ONEHUNDRED);
        if (cashNum3 != null && cashNum3 > 0){
            System.out.println("give you onehundred "+cashNum3);
        }
        Integer cashNum4 = account.getCashNum(CashType.TWENTY);
        if (cashNum4 != null && cashNum4 > 0){
            System.out.println("give you twenty "+cashNum4);
        }
    }
}
