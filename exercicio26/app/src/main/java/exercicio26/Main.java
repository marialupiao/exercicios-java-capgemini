/* Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
Caso o usuário digite um número que não esteja neste intervalo, exibir a 
seguinte mensagem: número inválido */

package exercicio26;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
    }
}
