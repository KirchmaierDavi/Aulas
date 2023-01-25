package br.ufjf.dcc.poo.exercicios;

import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));

        int numSort = (int) (Math.random() * 100);
        while (num != numSort){

            if (num == numSort)
                JOptionPane.showMessageDialog(null, "voce acertou, seu cagao do caralho! ");
            else if(num > numSort)
                JOptionPane.showMessageDialog(null, "passa outro dia, otario, pecou pelo excesso");
            else
                JOptionPane.showMessageDialog(null, "passa outro dia, otario, pecou pela falta");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
            numSort = (int) (Math.random() * 100);
        }

    }
}
