package com.lightwing.main;

import javax.swing.*;
import java.awt.*;

public class HelloJButton {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Hello, Swing Button");
        // When the window is closed, do some respond
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(768, 480);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());

        JButton btn = new JButton("My Button");
        jf.add(btn);
    }
}
