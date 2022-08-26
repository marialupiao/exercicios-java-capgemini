/* Elabore um algoritmo que efetue a apresentação do valor da conversão em real
(R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da 
cotação do dólar e também a quantidade de dólares disponíveis com o usuário */

package exercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        double real, dolar, cotacaoDolar;
        
        System.out.println("Digite o valor em Reais (R$): ");
        real = sc.nextDouble();
        System.out.println("Digite a cotacao do dolar: ");
        cotacaoDolar = sc.nextDouble();
        
        dolar =  real / cotacaoDolar;
        
        System.out.println("A quantidade em dolares: U$" + 
                String.format("%.3f", dolar));
    }
}
