package br.ufjf.dcc.poo.exxVeiculo.models;

import java.util.Date;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private Date ultimaRevisao;

    public Date getUltimaRevisao() {
        return ultimaRevisao;
    }

    public void setUltimaRevisao(Date ultimaRevisao) {
        this.ultimaRevisao = ultimaRevisao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date proxRevisao(){
        Date data = null;
        return data;
    }
}
