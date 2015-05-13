package com.mediator.pattern;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by wyr on 2015/5/13.
 */
public class BtnBook extends JButton implements Command{
    private Mediator mediator;

    public  BtnBook(ActionListener al,Mediator m){
        super("Book");
        addActionListener(al);
        mediator = m;
        mediator.registerBook(this);
    }
    @Override
    public void execute() {
        mediator.book();
    }
}
