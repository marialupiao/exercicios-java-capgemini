/* Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em real
(R$) de um valor lido em d�lar (US$). O algoritmo dever� solicitar o valor da 
cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o usu�rio */

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
