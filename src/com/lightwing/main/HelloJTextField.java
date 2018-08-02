package com.lightwing.main;

import javax.swing.*;
import java.awt.*;

public class HelloJTextField {
    public static void main(String[] args) { // Main Method()
        JFrame jf = new JFrame("Hello, Text");
        jf.setLayout(new FlowLayout());
        // adding a new text field

        JTextArea jTextArea = new JTextArea(5, 10);
        jTextArea.setText("Type something here...");
        jf.add(jTextArea);
        showMe(jf);
    }

    private static void showMe(JFrame jf) {
        // Setting response when the window is shut down
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(768, 480);
        jf.setVisible(true);
    }
}
