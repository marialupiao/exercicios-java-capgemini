/* Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores de
forma que a vari�vel A passe a possuir o valor da vari�vel B e a vari�vel B passe
a possuir o valor da vari�vel A. Apresentar os valores trocados */

package exercicio6;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, troca;
        
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        
        troca = a;
        a = b;
        b = troca;
        
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

    }
}
