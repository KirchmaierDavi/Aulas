package br.ufjf.dcc.poo.exxDiagrama.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Departamento{
    private int codigo;
    private ArrayList<Funcionario> funcionarios;

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
