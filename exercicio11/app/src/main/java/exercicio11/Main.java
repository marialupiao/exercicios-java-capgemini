/* Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor 
de venda. Sabe-se que o pre�o de custo receber� um acr�scimo de acordo com um 
percentual informado pelo usu�rio */

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
