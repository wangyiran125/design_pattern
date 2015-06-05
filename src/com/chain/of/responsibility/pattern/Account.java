package com.chain.of.responsibility.pattern;

import java.util.Map;

/**
 * Created by wyr on 2015/6/5.
 */
public class Account {
    private Map<String,Integer> cashMap;

    public Account(Map<String, Integer> cashMap) {
        this.cashMap = cashMap;
    }

    public Map<String, Integer> getCashMap() {
        return cashMap;
    }

    public void setCashMap(Map<String, Integer> cashMap) {
        this.cashMap = cashMap;
    }

    public Integer getCashNum(CashType onehundred) {
       return cashMap.get(onehundred.getCashValue());
    }
}
