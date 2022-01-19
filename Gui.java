package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    public Gui(){
    JFrame frm=new JFrame();
    JPanel pnl=new JPanel();

    pnl.setLayout(new java.awt.GridLayout(3,3));


        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                final JButton button = new JButton();
                String string = i +  "" + j;
                button.setText("");
                button.setName(string);
                button.addActionListener(
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                TicTacToe.buttonClicked(button);
                                TicTacToe.regeln(button);
                            }
                        });
                button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                pnl.add(button);
            }

        }
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm.add(pnl);
        frm.setSize(800,600);
        frm.setVisible(true);
        }

    }


