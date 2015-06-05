package com.chain.of.responsibility.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wyr on 2015/6/5.
 */

//https://sourcemaking.com/design_patterns/chain_of_responsibility
//http://java.dzone.com/articles/design-patterns-uncovered-chain-of-responsibility
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> cashMap = getStringIntegerMap();
        CashHandler cashHandler = getCashHandler();
        Account account = new Account(cashMap);
        cashHandler.handleRequest(account);
        }

    private static Map<String, Integer> getStringIntegerMap() {
        Map<String,Integer> cashMap = new HashMap<>();
        cashMap.put(CashType.FIFTY.getCashValue(),2);
        cashMap.put(CashType.TWENTY.getCashValue(), 4);
        return cashMap;
    }

    private static CashHandler getCashHandler() {
        CashHandler cashHandler = new OneHundredHandler();
        cashHandler.setNext(new TwentyHandler());
        cashHandler.setNext(new FiftyHandler());
        cashHandler.setNext(new OneHandler());
        return cashHandler;
    }
}
