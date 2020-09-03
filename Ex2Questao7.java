/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2questao7;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Ex2Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual foi o valor da compra na loja Mamão com Açucar? ");
        float v = teclado.nextFloat();
        int p = (int)(v/5);
        System.out.println("Você irá pagar 5 prestações de: " + p);
    }
    
}
