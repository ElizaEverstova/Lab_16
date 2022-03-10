package com.company;

import javax.swing.*;

import java.awt.*;


public class Main extends JComponent {

    @Override

    public void paint(Graphics g) {

        g.drawRect(50, 150, 178, 200);//dom
        g.drawRect(75, 230, 50, 50);//okno
        g.drawLine(150, 50, 250, 175);
        g.drawLine(25, 175, 150, 50);
        g.drawLine(200, 110, 200, 75);
        g.drawLine(220, 140, 220, 75);
        g.drawLine(200, 75, 220, 75);
        g.drawLine(390, 300, 390, 350);
        g.drawLine(410, 300, 410, 350);
        g.drawArc(300, 100, 200, 200, 275, 350);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("house");
        Main draw = new Main();
        draw.setSize(400, 400);
        frame.add(draw);
        frame.pack();
        frame.setVisible(true);

    }

}
