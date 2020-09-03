/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2questao2;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Ex2Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos quilometros foram percorridos? ");
        float km = teclado.nextFloat();
        System.out.println("Quantos litos de combustível foram gastos? ");
        float litros = teclado.nextFloat();
        int cm = (int)(km/litros);
        System.out.println("O cosumo médio de combustível durante o trajeto foi de: "+cm);
    }
    
}
