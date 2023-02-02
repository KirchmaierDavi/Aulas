package br.ufjf.dcc.poo.exxVeiculo.models;

public class Caminhao extends Veiculo{
    private float license;
    private float val;

    public float getVal() {
        return val;
    }

    public void setVal(float val) {
        this.val = val;
    }

    public float getLicense() {
        return license;
    }

    public void setLicense(float license) {
        this.license = license;
    }
}
