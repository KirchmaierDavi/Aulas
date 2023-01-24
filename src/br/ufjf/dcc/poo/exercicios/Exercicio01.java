package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double lt, ct, lc, cc;
        System.out.println("digite as medidas do terreno: ");
        lt = teclado.nextDouble();
        ct = teclado.nextDouble();
        System.out.println("Digite as medidas da casa: ");
        lc = teclado.nextDouble();
        cc = teclado.nextDouble();

        double areaCasa, areaT, p;
        areaCasa = lc * cc;
        areaT = lt * ct;

        p = 100 - ((areaCasa/areaT) * 100);

        System.out.println("a porcentagem do terreno ocupado e de: " + p + "%");
    }
}
