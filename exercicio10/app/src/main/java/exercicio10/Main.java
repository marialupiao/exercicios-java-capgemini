/* A Loja Mam�o com A��car est� vendendo seus produtos em 5 (cinco) presta��es
sem juros. Fa�a um algoritmo que receba um valor de uma compra e mostre o
valor das presta��es */

package exercicio10;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        double valorCompra;
        
        System.out.print("Digite o valor total da compra: ");
        valorCompra = sc.nextDouble();
        
        double prestacoes = valorCompra / 5;
        
        System.out.print("Valor das prestacoes: 5x R$" + prestacoes);
  
    }
}
