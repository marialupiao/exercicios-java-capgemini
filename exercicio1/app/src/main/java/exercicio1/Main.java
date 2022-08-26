// Faça um algoritmo que receba dois números e exiba o resultado da sua soma

package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.println("Digite o primeiro numero: ");
        x = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = sc.nextInt();
        
        int soma = x + y;
        
        System.out.println("A soma dos dois numeros e de: " + soma);
        
    }
}
