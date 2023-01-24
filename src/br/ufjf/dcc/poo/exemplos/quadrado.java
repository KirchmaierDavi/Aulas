package br.ufjf.dcc.poo.exemplos;

import java.util.Scanner;

public class quadrado {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        float n1, n2, n3;
        float media;

        System.out.print("informe n1: ");
        n1 = teclado.nextFloat();

        System.out.print("Informe n2: ");
        n2 = teclado.nextFloat();

        System.out.print("Informe n3: ");
        n3 = teclado.nextFloat();

        media =  (n1 + n2 + n3)/3;

        System.out.println("O valor da media e: " + media);
    }
}
