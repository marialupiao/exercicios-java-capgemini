/* Faça um algoritmo que receba um número e mostre uma mensagem caso este número
seja maior que 80, menor que 25 ou igual a 40 */

package exercicio23;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um numero:");
        numero = sc.nextInt();
        
        if (numero > 80) {
            System.out.println("Numero maior que 80.");
        } else if (numero < 25) {
            System.out.println("Numero menor que 25.");
        } else if (numero == 40) {
            System.out.println("Numero igual a 40.");
        }
    }
}
