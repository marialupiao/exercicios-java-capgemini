/* Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou 
diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles s�o 
iguais. Caso sejam diferentes, informe qual n�mero � o maior, e uma 
mensagem que s�o diferentes */

package exercicio25;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Digite os dois numeros:  ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        if (num1 == num2) {
            System.out.println("Os numeros sao iguais.");
        } else {
            if (num1 > num2) {
                System.out.println("Os numeros sao diferentes. "
                        + "O numero 1 e maior");
            } else {
                System.out.println("Os numeros sao diferentes. " 
                        + "O numero 2 e maior");
            }
        }
    }
}
