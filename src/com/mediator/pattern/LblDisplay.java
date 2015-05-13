package com.mediator.pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wyr on 2015/5/13.
 */
public class LblDisplay extends JLabel{
    private Mediator med;

    public LblDisplay(Mediator med) {
        super("just start");
        this.med = med;
        this.med.registerDisplay(this);
        setFont(new Font("Arial",Font.BOLD,24));
    }

}
