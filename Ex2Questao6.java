/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2questao6;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Ex2Questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor depositado: ");
        float d = teclado.nextFloat();
        System.out.println("A quantos meses este valor foi depositado? ");
        float m = teclado.nextFloat();
        int j = (int) ((d*m*0.70)/100);
        System.out.println("Você teve um rendimento de " + j);
    }
    
}
