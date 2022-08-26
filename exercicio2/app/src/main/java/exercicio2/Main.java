// Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
// multiplicação e a divisão dos dois números lidos

package exercicio2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float x;
        float y;
        
        System.out.println("Digite um numero: ");
        x = sc.nextInt();
        System.out.println("Digite outro numero: ");
        y = sc.nextInt();
        
        float soma = x + y;
        float subtracao = x - y;
        float multiplicacao = x * y;
        float divisao = x / y;
        
        System.out.println("RESULTADOS:");
        System.out.println("Soma = " + soma);
        System.out.println("Subtracao = " + subtracao);
        System.out.println("Multiplicacao = " + multiplicacao);
        System.out.println("Divisao = " + divisao);    
    }
}
