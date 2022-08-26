/*Faça um algoritmo que receba um valor que foi depositado e exiba o valor
com rendimento após um mês. Considere fixo o juro da poupança em 0,07% a. m  */

package exercicio9;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double valor, rendimento, juros, total;
        
        System.out.print("Digite o valor a ser depositado: R$");
        valor = sc.nextDouble();
        
        juros = 0.07 / 100;
        rendimento = valor * juros;
        total = rendimento + valor;
        
        System.out.println("Valor + Rendimento: R$" + 
                String.format("%.2f", total));
    }
}
