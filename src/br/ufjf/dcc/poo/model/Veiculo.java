package br.ufjf.dcc.poo.model;

public abstract class Veiculo {
    private String marca;
    private int tanque;
    private float km;

    public float getKm() {
        return km;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setKml(float kml) {
        this.km = km;
    }

    public float calculaConsumo (float L){
        return (float) (this.tanque/this.km) * L;
    }
}
