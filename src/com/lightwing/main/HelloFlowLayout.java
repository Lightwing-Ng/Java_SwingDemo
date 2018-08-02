package com.lightwing.main;

import javax.swing.*;
import java.awt.*;

public class HelloFlowLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello, FlowLayout");
        jFrame.setLayout(new FlowLayout());

        for (int i = 0; i < 10; ++i) {
            jFrame.add(new JButton(i + ""));
        }

        jFrame.setSize(768, 480);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
