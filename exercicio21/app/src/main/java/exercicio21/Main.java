/* Escreva um algoritmo que leia os dados de “N” pessoas 
(nome, genero, idade e saúde) e informe se está apta ou não para cumprir o 
serviço militar obrigatório. Informe os totais */

package exercicio21;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Quantos casos serao digitados? ");
        n = sc.nextInt();
        
        String[] nomes = new String[n];
        String[] generos = new String[n];
        String[] saude = new String[n];
        int[] idades = new int[n];
        
        sc.nextLine();
        for (int i=0; i<n; i++) {
            System.out.print("Nome da " + (i+1) + "a pessoa: ");
            nomes[i] = sc.nextLine();
            System.out.print("Genero da " + (i+1) + "a pessoa (F-fem/M-masc): ");
            generos[i] = sc.nextLine();
            System.out.print("Idade da " + (i+1) + "a pessoa: ");
            idades[i] = sc.nextInt();
            System.out.print("Estado de saude da " + (i+1) 
                    + "a pessoa (OK / PCD): ");
            sc.nextLine();
            saude[i] = sc.nextLine();
            
            if ("M".equals(generos[i]) && idades[i] >= 18 && "OK".equals(saude[i])) {
                System.out.println("Esta pessoa esta apta para cumprir "
                        + "o serviço militar");
            } else {
                System.out.println("Esta pessoa nao esta apta para cumprir "
                        + "o serviço militar");
            }
        } 
    }
}
