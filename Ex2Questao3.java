/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2questao3;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Ex2Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = teclado.nextLine();
        System.out.println("Quanto ele ganha? "); 
        float sal = teclado.nextFloat();
        System.out.println("Qual foi o total de vendas deste vendedor? ");
        float vendas = teclado.nextFloat();
        int salf = (int)(((15*vendas)/100)+sal);
        System.out.println("Vendendor: " + nome);
        System.out.println("Salário: " + sal);
        System.out.println("Salário no final do mês: " + salf);
        
    }
    
}
