package com.company;

import javax.swing.*;
import java.awt.*;

public class TicTacToe{
    public static int zaehler=0;

    public static String[][] board=new String[3][3];

    public static void buttonClicked(JButton button) {
        if(button.getText().equals("")) {
            zaehler++;
            if(zaehler%2==1){
                button.setText("X");
            }
            if(zaehler%2==0){
                button.setText("O");
            }
        }
    }

    public static void regeln(JButton button) {
        String s = button.getText();

        int x = Character.getNumericValue(button.getName().charAt(0));
        int y = Character.getNumericValue(button.getName().charAt(1));
        board[x][y] = s;

        if(board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            JOptionPane.showMessageDialog(null,s + " won.");
        } else if(board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            JOptionPane.showMessageDialog(null,s + " won.");
        } else if(zaehler == 9) {
            JOptionPane.showMessageDialog(null, "draw.");
        } else {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] != null && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                    JOptionPane.showMessageDialog(null, s + " won."); break;
                }
                if (board[0][i] != null && board[0][i].equals(board[1][i]) && board[0][i].equals(board[2][i])) {
                    JOptionPane.showMessageDialog(null, s + " won."); break;
                }
            }
        }
        }
    }
