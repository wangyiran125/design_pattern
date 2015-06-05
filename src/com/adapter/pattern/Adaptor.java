package com.adapter.pattern;

/**
 * Created by wyr on 2015/6/5.
 */

//Sometimes a toolkit class that¡¯s designed for reuse isn¡¯t reusable only because its
//interface doesn¡¯t match the domain-specific interface an application requires
public class Adaptor implements Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specialOperate();
    }
}
