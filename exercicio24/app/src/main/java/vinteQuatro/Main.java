// Faça um algoritmo que receba “N” números e mostre positivo, 
// negativo ou zero para cada número

package vinteQuatro;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            
            if (numero == 0) {
                System.out.println("O numero e zero");
            } else {
                if (numero > 0) {
                    System.out.println("O numero e positivo");
                } else {
                    System.out.println("O numero e negativo");
                }
            }
            
            System.out.println("Deseja continuar? S - Sim / N- Nao");
            desejaContinuar = sc.next().charAt(0);
        
        }   
    }
}
