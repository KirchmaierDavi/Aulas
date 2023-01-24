package br.ufjf.dcc.poo.exercicios;

import javax.swing.*;

public class Exercicio07 {
    public static void main(String[] args){
        int km, l;
        km = Integer.parseInt(JOptionPane.showInputDialog("digite os km rodados: "));
        l = Integer.parseInt(JOptionPane.showInputDialog("digite o tamanho do tanque: "));

        float kmL;
        kmL = (float) km/l;

        JOptionPane.showMessageDialog(null, "o carro faz: " + kmL + "km/l");
    }
}
