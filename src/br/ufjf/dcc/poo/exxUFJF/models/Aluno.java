package br.ufjf.dcc.poo.exxUFJF.models;

public class Aluno extends Pessoa{
   private String mat;
   private float mensal;
   private float bolsa;

   @Override
   public float calculaMensalidade(){

      float mensalidade = this.mensal - this.bolsa;
      return mensalidade;
   }

   public float getBolsa() {
      return bolsa;
   }

   public void setBolsa(float bolsa) {
      this.bolsa = bolsa;
   }

   public String getMat() {
      return mat;
   }

   public void setMat(String mat) {
      this.mat = mat;
   }

   public float getMensal() {
      return mensal;
   }

   public void setMensal(float mensal) {
      this.mensal = mensal;
   }
}
