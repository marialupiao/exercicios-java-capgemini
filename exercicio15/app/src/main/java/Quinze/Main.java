// Faça um algoritmo que receba um número e diga se este 
// número está no intervalo entre 100 e 200
 
package Quinze;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        
      int n;
      
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite um numero: ");
        n = sc.nextInt();
        
        if (n >= 100 && n <= 200) {
            System.out.println("O numero esta no intervalo.");
        } else {
            System.out.println("O numero nao esta no intervalo.");  
        }        
    }
}
