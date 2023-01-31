package br.ufjf.dcc.poo.exx20;

public class people {
    private String nome;
    private String sexo;

    private float media;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public people(){
    }

    public float media(float n1, float n2, float n3){
        this.media = (n1 + n2 + n3)/3;
        return this.media;
    }

    public void pFinal(){
        if(this.media < 60){
            System.out.println("Bombou filho, faltam " + (60 - media) + "pontos");
        }else{
            System.out.println("Passou zé!");
        }
    }


}
