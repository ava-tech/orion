package com.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{

    private JTextArea textArea;
    private JButton btn;


    public MainFrame(){
        super("Hello World");
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn =  new JButton("Click Me");

//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textArea.append("Hello\n");
//            }
//        });

        WinAction winAction =  new WinAction();
        btn.addActionListener(winAction);

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    class WinAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.append("Hello\n");
        }
    }
}
