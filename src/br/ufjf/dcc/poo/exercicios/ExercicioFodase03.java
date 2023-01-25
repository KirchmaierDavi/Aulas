package br.ufjf.dcc.poo.exercicios;

import javax.swing.*;

public class ExercicioFodase03 {
    static public void main(String[] args){
        int x = 0;
        int i = 0;
        while (x != -1){
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero (-1 para parar): "));
            if(x % 2 != 0)
                i++;
        }
        JOptionPane.showMessageDialog(null, "Quantidade de impares: " + i);
    }
}
