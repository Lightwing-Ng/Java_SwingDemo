package com.lightwing.main;

import javax.swing.*;
import java.awt.*;

public class HelloJButton {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello, Swing Button");
        // When the window is closed, do some respond
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(768, 480);
        jFrame.setVisible(true);
        jFrame.setLayout(new FlowLayout());

        JButton btn = new JButton("My Button");
        jFrame.add(btn);
    }
}
