package br.ufjf.dcc.poo.exercicios;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio01agorae05 {
    public static void main(String[] args){
        double lt, ct, lc, cc;
        lt = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do terreno"));
        ct = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do terreno"));
        lc = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da casa"));
        cc = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da casa"));

        double areaCasa, areaT, p;

        areaCasa = lc * cc;
        areaT = lt * ct;

        p = 100 - ((areaCasa/areaT) * 100);

        JOptionPane.showMessageDialog(null, "a porcentagem da area restante é: " + p + "%");
    }
}
