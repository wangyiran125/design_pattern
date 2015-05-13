package com.mediator.pattern;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by wyr on 2015/5/13.
 */
public class BtnSearch extends JButton implements Command{
    private Mediator mediator;

    public  BtnSearch(ActionListener al,Mediator m){
        super("Search");
        addActionListener(al);
        mediator =m;
        mediator.registerSearch(this);
    }
    @Override
    public void execute() {
        mediator.search();
    }
}
