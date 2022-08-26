/* Escreva um algoritmo que leia dois valores inteiros distintos e informe 
qual é o maior */

package exercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x, y, maior;
        
        System.out.println("Digite o valor de X e Y: ");
        x = sc.nextInt();
        y = sc.nextInt();
        
        if (x > y) {
            maior = x;
            System.out.println("O valor de X e maior: " + x);
        } else {
            System.out.println("O valor de Y e maior: " + y);
        }
    }
}
