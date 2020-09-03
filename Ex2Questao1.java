/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2questao1;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Ex2Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Digite um numero: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite o segundo número: ");
        float n2 = teclado.nextFloat();
        int s =(int) ((int)  n1 + n2);
        int sub = (int) ((int) n1 - n2);
        int d = (int) ((int) n1 / n2);
        int m = (int) ((int) n1 * n2);
        System.out.println("A soma entre os números é: " + s);
        System.out.println("A subtação entres os números é:" + sub);
        System.out.println("A multiplicação entre os números é: " + m);
        System.out.println("A divisão entre os números é: " + d);
                
        
                
    }
    
}
