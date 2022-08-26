/* Escreva um algoritmo que leia três valores inteiros distintos 
e os escreva em ordem crescente */

package exercicio30;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] vet = new int[3];
        
        System.out.println("Digite tres valores inteiros: ");
        for (int i=0; i<3; i++) {
            vet[i] = sc.nextInt();
        }
       
        Arrays.sort(vet);
        System.out.println(Arrays.toString(vet));
        
    }
}
