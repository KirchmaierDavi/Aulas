package br.ufjf.dcc.poo.model;

public class Caminhao extends Automovel{
    private float tara;

    public float getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = (float) tara;
    }

    public float consumo(float L){
        return (float) this.consumo(L) * L/this.tara;
    }
}
