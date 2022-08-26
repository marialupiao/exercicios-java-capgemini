// Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. 
// Mostre como resultado se houve lucro, prejuízo ou empate para cada produto.
// Informe o valor de custo de cada produto, o valor de venda de cada produto, 
// a média de preço de custo e do preço de venda.

package vinteDois;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String produto;
        float custo;
        float venda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
       
        int i = 0;
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto: ");
            sc.nextLine();
            produto = sc.nextLine();
            
            System.out.println("Digite o preco de custo do produto: ");
            custo = sc.nextFloat();
            
            System.out.println("Digite o preco de venda do produto: ");
            venda = sc.nextFloat();
            
            totalCusto = totalCusto + custo;
            totalVenda = totalVenda + venda;
            
            if (custo == venda) {
                System.out.println("Houve um empate entre o preco de custo e o "
                        + "preco de venda");
            } else {
                if (custo > venda) {
                    System.out.println("Houve prejuizo");
                } else {
                    System.out.println("Houve lucro");
                }
            }
            
            System.out.println(produto + ", preco de custo = " + custo + 
                    ", preco de venda = " + venda);
 
        } 
    System.out.println("A media do preco de custo e de: " + (totalCusto / i));
    System.out.println("A media do preco de venda e de: " + (totalVenda / i));
    }
}
