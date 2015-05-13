package com.mediator.pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wyr on 2015/5/13.
 */
public class ParticipantMediator implements Mediator{
    private BtnView btnView;
    private BtnSearch btnSearch;
    private BtnBook btnBook;
    private LblDisplay show;
    @Override
    public void book() {
        btnBook.setEnabled(false);
        btnView.setEnabled(true);
        btnSearch.setEnabled(true);
        show.setText("booking...");
    }

    @Override
    public void view() {
        btnView.setEnabled(false);
        btnSearch.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("viewing...");
    }

    @Override
    public void search() {
        btnSearch.setEnabled(false);
        btnView.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("searching...");
    }

    @Override
    public void registerView(BtnView v) {
        this.btnView = v;
    }

    @Override
    public void registerSearch(BtnSearch s) {
        this.btnSearch = s;
    }

    @Override
    public void registerBook(BtnBook b) {
        this.btnBook = b;
    }

    @Override
    public void registerDisplay(LblDisplay d) {
        this.show = d;
    }

}
