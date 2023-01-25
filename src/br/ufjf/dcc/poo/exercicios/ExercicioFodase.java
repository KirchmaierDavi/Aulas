package br.ufjf.dcc.poo.exercicios;

import javax.swing.*;

public class ExercicioFodase {
    public static void main (String[] args){
        int x1, i = 0;
        float soma = 0;

        x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));

        while(x1 != -1){
            soma = soma + x1;
            i++;
            x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        }
        float media = soma/i;

        JOptionPane.showMessageDialog(null, "a media é: " + media);
    }
}
