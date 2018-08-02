package com.lightwing.main;

import javax.swing.*;
import java.awt.*;

public class HelloBorderLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("BorderLayout Test");
        jFrame.setLayout(new BorderLayout());
        jFrame.add(new JButton("east"), BorderLayout.EAST);
        jFrame.add(new JButton("center"), BorderLayout.CENTER);
        jFrame.add(new JButton("south"), BorderLayout.SOUTH);
        jFrame.add(new JButton("north"), BorderLayout.NORTH);
        jFrame.add(new JButton("west"), BorderLayout.WEST);

        jFrame.setSize(768, 480);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
