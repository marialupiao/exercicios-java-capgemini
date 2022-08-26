/* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de
forma que a variável A passe a possuir o valor da variável B e a variável B passe
a possuir o valor da variável A. Apresentar os valores trocados */

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
