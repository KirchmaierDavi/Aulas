package br.ufjf.dcc.poo.exxUFJF.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Professor extends Pessoa{
    private String codigo;
    private String formacao;
    private int horaAula;
    private int quantidadeAula;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(int horaAula) {
        this.horaAula = horaAula;
    }

    public int getQuantidadeAula() {
        return quantidadeAula;
    }

    public void setQuantidadeAula(int quantidadeAula) {
        this.quantidadeAula = quantidadeAula;
    }

    @Override
    public float calculaMensalidade(){
        float pagamento = this.horaAula * this.quantidadeAula;
        return pagamento;
    }
}
