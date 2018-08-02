package com.lightwing.main;

import javax.swing.*;

public class HelloJFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Hello, Swing");
        // When the window is closed, do some respond
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(768, 480);
        jf.setVisible(true);

        JLabel label = new JLabel();
        label.setText("Hello, this is one label");
        jf.add(label);
    }
}
