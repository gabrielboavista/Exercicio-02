/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2questao5;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Ex2Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Digite o valor da cotação do Dólar: ");
        float dolar = teclado.nextFloat();
        System.out.println("Quantos dólares seram convertidos em real? ");
        float real = teclado.nextFloat();
        int c = (int) ((int) dolar*real);
        System.out.println("De acordo com esta cotação você terá: " + c);        
    }
    
}
