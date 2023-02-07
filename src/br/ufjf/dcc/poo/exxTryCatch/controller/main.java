package br.ufjf.dcc.poo.exxTryCatch.controller;

import br.ufjf.dcc.poo.exxTryCatch.models.Calculadora;

import javax.swing.*;

public class main {
    public static void main(String[] args){
        Calculadora c = new Calculadora();
        c.setVal1(Float.parseFloat(JOptionPane.showInputDialog("digite o valor 1: " )));
        c.setVal2(Float.parseFloat(JOptionPane.showInputDialog("digite o valor 2: " )));
        c.setOp(JOptionPane.showInputDialog("digite a operação: " ));
        try{
            if(c.getOp().equals("s")){
                c.setResult(c.getVal1() + c.getVal2());
                JOptionPane.showMessageDialog(null, c.getResult());
            }else if(c.getOp().equals("m")){
                c.setResult(c.getVal1() * c.getVal2());
                JOptionPane.showMessageDialog(null, c.getResult());
            }else if(c.getOp().equals("d")){
                c.setResult(c.getVal1()/c.getVal2());
                JOptionPane.showMessageDialog(null, c.getResult());
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Erro no formato do numero");
            e.printStackTrace();
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Erro na conta");
            e.printStackTrace();
        }finally {
            JOptionPane.showMessageDialog(null, "terminou ze");
        }

    }
}
