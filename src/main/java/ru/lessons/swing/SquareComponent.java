package ru.lessons.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ShishkinA on 28.08.2018.
 */
public class SquareComponent extends JComponent implements ActionListener {
    private static final int SQUARE_SIZE = 30;
    private static final int STEP = 10;

    private int x = 0;
    private int y = 0;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton){
            JButton btn = (JButton) e.getSource();

            if (MoveSquareFrame.UP.equals(btn.getActionCommand())){
                y -= STEP;
            } else if (MoveSquareFrame.DOWN.equals(btn.getActionCommand())){
                y += STEP;
            }
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
    }
}
