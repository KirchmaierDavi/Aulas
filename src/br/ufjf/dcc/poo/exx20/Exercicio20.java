package br.ufjf.dcc.poo.exx20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        people p1 = new people();
        p1.setNome("Yago");
        p1.setIdade(19);
        p1.setSexo("M");

        ArrayList<people> pessoas = new ArrayList<people>();
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            people p = new people();
            System.out.println("Nome: ");
            p.setNome(teclado.nextLine());
            System.out.println("Sexo: ");
            p.setSexo(teclado.nextLine());
            System.out.println("idade: ");
            p.setIdade(Integer.parseInt(teclado.nextLine()));
            pessoas.add(p);
        }
        for(people p :pessoas){
            System.out.println("Nome: " + p.getNome());
            System.out.println("idade: " + p.getIdade());
            System.out.println("sexo: " + p.getSexo());
        }
        System.out.println("Aluno 1 com media de: " + p1.media(76, 58, 55));
        p1.pFinal();
    }
}
