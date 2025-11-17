/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parimpar;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //leitura do teclado

        System.out.print("Digite a quantidade de números: ");
        int quantidade = sc.nextInt();
        int[] pares = new int[quantidade];   //vetor para números pares
        int[] impares = new int[quantidade]; //vetor para números ímpares
        int p = 0, i = 0; //contadores
        for (int x = 0; x < quantidade; x++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {     //testa se é par
                pares[p] = num;
                p++;
            } else {                //testa se é ímpar
                impares[i] = num;
                i++;
            }
        }
        
        System.out.println("\nNúmeros pares:");
        for (int k = 0; k < p; k++) {
            System.out.print(pares[k] + " ");
        }

        System.out.println("\n\nNúmeros ímpares:");
        for (int k = 0; k < i; k++) {
            System.out.print(impares[k] + " ");
        }
        sc.close();
    }
}
