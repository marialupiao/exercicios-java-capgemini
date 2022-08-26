/* O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o 
percentual do distribuidor e dos impostos aplicados (primeiro os impostos são 
aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre
o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o 
custo ao consumidor do mesmo */

package exercicio12;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double custoFabrica, distribuidor, impostos, valorConsumidor;
        
        System.out.print("Digite o valor do custo de fabrica: ");
        custoFabrica = sc.nextDouble();
        
        impostos = custoFabrica * 0.45;
        distribuidor = (custoFabrica + impostos) * 0.28;
        valorConsumidor = custoFabrica + impostos + distribuidor;

        
        System.out.println("O valor de custo para o consumidor e de: R$" 
                + String.format("%.3f", valorConsumidor));
    }
}
