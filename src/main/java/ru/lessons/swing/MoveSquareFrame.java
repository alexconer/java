package ru.lessons.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ShishkinA on 27.08.2018.
 */
public class MoveSquareFrame extends JFrame {
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";

    public MoveSquareFrame(){
        SquareComponent sc = new SquareComponent();
        add(sc);

        JButton btnUp = new JButton(UP);
        btnUp.setActionCommand(UP);
        btnUp.addActionListener(sc);
        add(btnUp, BorderLayout.NORTH);

        JButton btnDown = new JButton(DOWN);
        btnDown.setActionCommand(DOWN);
        btnDown.addActionListener(sc);
        add(btnDown, BorderLayout.SOUTH);

        setBounds(100, 100, 400, 400);
    }
}
