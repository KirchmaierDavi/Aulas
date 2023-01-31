package br.ufjf.dcc.poo.exercicios;

import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args){
        String nomeUser;
        nomeUser = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "nome adicionado: " + nomeUser);
    }
}
