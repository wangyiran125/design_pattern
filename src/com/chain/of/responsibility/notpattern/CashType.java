package com.chain.of.responsibility.notpattern;

/**
 * Created by wyr on 2015/6/5.
 */
public enum CashType {
    ONEHUNDRED("100"),FIFTY("50"),TWENTY("20"),ONE("1");
    private String cashValue;
    CashType(String value) {
        this.cashValue = value;
    }

    public String getCashValue() {
        return cashValue;
    }
}
