package com.lightwing.main;

import javax.swing.*;
import java.awt.*;

public class HelloGridLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello, GridLayout");
        GridLayout gridLayout = new GridLayout(10, 10);
        jFrame.setLayout(gridLayout);

        for (int i = 0; i < 100; jFrame.add(new JButton("" + i++))) ;

        jFrame.setSize(768, 480);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
