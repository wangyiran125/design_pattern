package com.mediator.pattern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wyr on 2015/5/13.
 */
public class Test extends JFrame implements ActionListener{

    Mediator med = new ParticipantMediator();
    public Test() {
        JPanel p = new JPanel();
        p.add(new BtnView(this, med));
        p.add(new BtnBook(this, med));
        p.add(new BtnSearch(this, med));
        getContentPane().add(new LblDisplay(med), "North");
        getContentPane().add(p, "South");
        setSize(400, 200);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Command comd = (Command) e.getSource();
        comd.execute();
    }

    public static void main(String[] args) {
        new Test();
    }

}
