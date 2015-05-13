package com.mediator.pattern;

/**
 * Created by wyr on 2015/5/13.
 */
public interface Mediator {
    public void book();
    public void view();
    public void search();
    public void registerView(BtnView v);
    public void registerSearch(BtnSearch s);
    public void registerBook(BtnBook b);
    public void registerDisplay(LblDisplay d);
}
