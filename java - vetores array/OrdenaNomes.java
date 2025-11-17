/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenanomes;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
import java.util.Arrays;

public class OrdenaNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de nomes: ");
        int quantidade = sc.nextInt();
        
        sc.nextLine(); //limpa o buffer
        
        String[] nomes = new String[quantidade];
        
        for (int x = 0; x < quantidade; x++) {
            System.out.print("Digite um nome: ");
            nomes[x] = sc.nextLine();
        }

        Arrays.sort(nomes); //ordena alfabeticamente

        System.out.println("\nNomes em ordem alfabética:");
        for (String n : nomes) {
            System.out.println(n);
        }
        sc.close();
    }
}
