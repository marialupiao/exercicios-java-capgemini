/* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor 
de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um 
percentual informado pelo usuário */

package exercicio11;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double precoCusto, acrescimo, valorVenda;
        
        System.out.print("Informe o preco de custo do produto: ");
        precoCusto = sc.nextDouble();
        
        System.out.print("Informe o valor percentual do acrescimo: ");
        acrescimo = sc.nextDouble();
        
        valorVenda = precoCusto + (precoCusto * acrescimo / 100);
        
        System.out.println("O valor de venda e: R$" + 
                String.format("%.2f", valorVenda));
    }
}
