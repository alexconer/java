package ru.lessons.interfacing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by ShishkinA on 05.09.2018.
 */
public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource().getClass().getName());
        System.out.println(new Date());
    }
}
