package com.lightwing.main;

import javax.swing.*;

public class HelloJFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello, Swing");
        // When the window is closed, do some respond
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(768, 480);
        jFrame.setVisible(true);

        JLabel label = new JLabel();
        label.setText("Hello, this is one label");
        jFrame.add(label);
    }
}
