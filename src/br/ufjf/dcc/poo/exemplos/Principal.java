package br.ufjf.dcc.poo.exemplos;

import java.util.List;

public class Principal {
    public static void main(String [] args){
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.cpf ="001.543.876-52";
        pessoa1.idade = 18;
        pessoa1.nome = "dani";
        pessoa1.sexo = "F";

        pessoa2.cpf = "444.555.666-77";
        pessoa2.idade = 22;
        pessoa2.nome = "ficada que eu dei";

        pessoa3.cpf = "111.222.333-44";
        pessoa3.idade = 30;
        pessoa3.nome = "no seu cu";

        Funcionario cria = new Funcionario();
        cria.cargo = "aspone";
        cria.sexo = "nao-binarie";

        Professor prof = new Professor();
        prof.numAulas = 0;

        Aluno seila = new Aluno();
        seila.registro = "vagabundo";

        List<Pessoa> pessoas;


    }
}
