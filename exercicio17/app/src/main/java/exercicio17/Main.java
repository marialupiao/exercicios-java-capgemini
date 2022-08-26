/* Leia 10 números e ao final informar quantos números estão no intervalo 
entre 10 (inclusive) e 150 (inclusive) */

package exercicio17;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[] vet = new double[10];
        
        for (int i=0; i<10; i++) {
            System.out.print("Digite o " + (i+1) + "o. numero: ");
            vet[i] = sc.nextDouble();
        }
        
        int cont = 0;
        for (int i=0; i<10; i++) {
            if (vet[i] >= 10 && vet[i] <=150) { 
                cont++;
            }
        }
        
        System.out.println("Numeros dentro do intervalo 10 - 150: " + cont); 
    }
}
