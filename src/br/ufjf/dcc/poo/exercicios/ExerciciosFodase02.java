package br.ufjf.dcc.poo.exercicios;

import javax.swing.*;

public class ExerciciosFodase02 {
    static public void main (String[] args){
        int x1, x2;
        x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inicial: "));
        x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero final: "));

        for(int i = x1; i <= x2; i++){
            JOptionPane.showMessageDialog(null, "Numeros do intervalo: " + i);
        }
    }
}
