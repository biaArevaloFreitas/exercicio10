package com.mycompany.exercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author biaar
 */
public class Exercicio10 {

    public static void main(String[] args) {
       int num1, num2,soma;
       
       num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
       
       soma = num1 + num2;
       
       
       if(soma > 10 ){
           JOptionPane.showMessageDialog(null, soma + " é maior que 10");   
       } else {
           JOptionPane.showMessageDialog(null, soma + " é menor que 10"); 
       }
    }
}
