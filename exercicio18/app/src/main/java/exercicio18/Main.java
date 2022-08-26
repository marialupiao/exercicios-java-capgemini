/* Faça um algoritmo que receba a idade de 5 pessoas e mostre mensagem 
informando “maior de idade” e “menor de idade” para cada pessoa. 
Considere a idade a partir de 18 anos como maior de idade */

package exercicio18;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int[] idades = new int[5];
        String[] nomes = new String[5];
        
        
        System.out.println("Digite os dados das 5 pessoas:");
        for (int i=0; i<5; i++) {
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            
            if (idades[i] >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
            sc.nextLine();
        }    
    }
}
