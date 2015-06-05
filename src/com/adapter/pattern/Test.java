package com.adapter.pattern;

/**
 * Created by wyr on 2015/6/5.
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adaptor();
        target.request();
    }
}
