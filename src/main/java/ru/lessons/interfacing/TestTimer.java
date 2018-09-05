package ru.lessons.interfacing;

import javax.swing.*;
import java.awt.event.ActionListener;


/**
 * Created by ShishkinA on 05.09.2018.
 */
public class TestTimer {
    public static void main(String[] args) {
        ActionListener tp = new TimePrinter();
        Timer t = new Timer(5000, tp);
        t.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
