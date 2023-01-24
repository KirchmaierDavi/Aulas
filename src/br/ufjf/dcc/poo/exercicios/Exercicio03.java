package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;


public class Exercicio03 {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        double n1, n2, n3;
        double media;

        System.out.print("informe n1: ");
        n1 = teclado.nextDouble();

        System.out.print("Informe n2: ");
        n2 = teclado.nextDouble();

        System.out.print("Informe n3: ");
        n3 = teclado.nextDouble();

        double determinante = (n2 * n2) - (4 * n1 * n3);
        double x1 = (- (n2) + Math.sqrt(determinante)/2 * n1);
        double x2 = (- (n2) - Math.sqrt(determinante)/2 * n1);

        System.out.println("x1 = " + x1 + " x2 = " + x2);


    }
}
