package br.ufjf.dcc.poo.exercicios;

import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args){
        int x1, x2, y1, y2;
        x1 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de x1: "));
        x2 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de x2: "));
        y1 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de y1: "));
        y2 = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de y2: "));

        float d;
        d = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        JOptionPane.showMessageDialog(null, "o valor de d é: " + d);
    }
}
