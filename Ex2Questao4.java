/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2questao4;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Ex2Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Qual a temperatura em Celsius? ");
        float c = teclado.nextFloat();
        int f = (int)((9*c+160)/5);
        System.out.println("A temperatura correspondete em Fahrenheit é: " + f);
        
    }
    
}
