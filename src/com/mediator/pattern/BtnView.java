package com.mediator.pattern;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by wyr on 2015/5/13.
 */
public class BtnView extends JButton implements Command{
    private Mediator mediator;

    public BtnView(ActionListener al, Mediator mediator) {
        super("View");
        addActionListener(al);
        this.mediator = mediator;
        mediator.registerView(this);
    }

    @Override
    public void execute() {
        mediator.view();
    }
}
