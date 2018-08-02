package com.lightwing.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private static final long serialVersionUID = -1717806291593500805L;
    private JTextField t1, t2, t3;
    private JButton b1, b2, b3, b4;

    private Calculator() {
        setTitle("iCalculator");
        JLabel l1 = new JLabel("Operand");
        JLabel l2 = new JLabel("Operand");
        JLabel l3 = new JLabel("Result");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        // 将窗口物体放入窗口
        GridBagLayout layout = new GridBagLayout();
        getContentPane().setLayout(layout);
        addComponent(layout, l1, 1, 0);
        addComponent(layout, l2, 2, 0);
        addComponent(layout, l3, 3, 0);
        addComponent(layout, t1, 1, 1);
        addComponent(layout, t2, 2, 1);
        addComponent(layout, t3, 3, 1);

        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        addComponent(layout, b1, 1, 2);
        addComponent(layout, b2, 1, 3);
        addComponent(layout, b3, 2, 2);
        addComponent(layout, b4, 2, 3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        this.pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent j) {
        double n;
        try {
            if (j.getSource() == b1) {
                double n1, n2;
                n1 = Double.parseDouble(t1.getText());
                n2 = Double.parseDouble(t2.getText());
                n = n1 + n2;
                t3.setText(String.valueOf(n));
            }
            if (j.getSource() == b2) {
                double n1, n2;
                n1 = Double.parseDouble(t1.getText());
                n2 = Double.parseDouble(t2.getText());
                n = n1 - n2;
                t3.setText(String.valueOf(n));
            }
            if (j.getSource() == b3) {
                double n1, n2;
                n1 = Double.parseDouble(t1.getText());
                n2 = Double.parseDouble(t2.getText());
                n = n1 * n2;
                t3.setText(String.valueOf(n));
            }
            if (j.getSource() == b4) {
                double n1, n2;
                n1 = Double.parseDouble(t1.getText());
                n2 = Double.parseDouble(t2.getText());
                n = n1 / n2;
                t3.setText(String.valueOf(n));
            }
        } catch (Exception ignored) {
        }
    }

    // 快捷使用 GridBagLayout 的方法
    private void addComponent(GridBagLayout layout, Component component, int row, int col) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(10, 2, 10, 2);
        constraints.weightx = 100;
        constraints.weighty = 100;
        constraints.gridx = col;
        constraints.gridy = row;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        layout.setConstraints(component, constraints);
        if (component instanceof JButton) {
            ((JButton) component).addActionListener(this);
        }
        getContentPane().add(component);
    }

    // initialize and display the window
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setVisible(true);
    }
}