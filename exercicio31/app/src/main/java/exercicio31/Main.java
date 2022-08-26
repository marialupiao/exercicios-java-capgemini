/* Dados três valores A, B e C, em que A e B são números reais e C é um 
caractere, pede-se para imprimir o resultado da operação de A por B se C for um 
símbolo de operador aritmético; caso contrário deve ser impressa uma mensagem de
operador não definido. Tratar erro de divisão por zero */

package exercicio31;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        double a, b, resultado;
        char c;
        
        System.out.println("Digite o valor de A e B: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        sc.nextLine();
        System.out.print("Digite o operador aritmetico (+, -, *, /): ");
        c = sc.next().charAt(0);
        
        switch (c) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado da operacao: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado da operacao: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado da operacao: " + resultado);
                break;
            case '/':
                if (b == 0 || a == 0) {
                    System.out.println("Impossivel divisao por zero");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado da operacao: " + resultado);
                }   break;
            default:
                System.out.println("Operador nao definido.");
                break;
        }
    }
}
