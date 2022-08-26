/* Escreva um algoritmo que leia o nome e o genero de 5 pessoas e informe o nome
e se é homem ou mulher. No final informe total de homens e de mulheres */

package exercicio19;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] nomes = new String[5];
        String[] generos = new String[5];
        int homens = 0, mulheres = 0;
        
        
        for (int i=0; i<5; i++) {
        System.out.print("Nome da " + (i+1) + "a pessoa: ");
        nomes[i] = sc.nextLine();
        System.out.print("Genero da " + (i+1) 
                + "a pessoa (F-Feminino / M-Masculino): ");
        generos[i] = sc.nextLine();   
        }
        
        for (int i=0; i<5; i++) {
        if ("F".equals(generos[i])) {
            mulheres++;
        } else if ("M".equals(generos[i])) {
            homens++;
        }
        }
        
        System.out.println("Quantidade de mulheres: " + mulheres);
        System.out.println("Quantidade de homens: " + homens);
    }
}
