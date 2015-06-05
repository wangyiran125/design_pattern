package com.chain.of.responsibility.notpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wyr on 2015/6/5.
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> cashMap = getStringIntegerMap();
        Account account = new Account(cashMap);
        BigHandlerCash bigHandlerCash = new BigHandlerCash();
        bigHandlerCash.handlerRequest(account);
        }

    private static Map<String, Integer> getStringIntegerMap() {
        Map<String,Integer> cashMap = new HashMap<>();
        cashMap.put(CashType.FIFTY.getCashValue(), 2);
        cashMap.put(CashType.TWENTY.getCashValue(), 4);
        return cashMap;
    }

}
