package com.lightwing.main;

import javax.swing.*;
import java.awt.*;

public class HelloEvent {
    // to create a object of TextArea
    private static JTextField jTextField = new JTextField(10);

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello Event");
        jFrame.setLayout(new FlowLayout());

        // adding a new text area
        jFrame.add(jTextField);

        // adding a button to the window
        JButton jButton = new JButton("My Button");
        jFrame.add(jButton);
        jButton.addActionListener(e -> HelloEvent.jTextField.setText("The Button was hit"));
        showMe(jFrame);
    }

    private static void showMe(JFrame jf) {
        // Setting response when the window is shut down
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(768, 480);
        jf.setVisible(true);
    }
}
