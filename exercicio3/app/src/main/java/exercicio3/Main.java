/* Escreva um algoritmo para determinar o consumo m�dio de um autom�vel 
sendo fornecida a dist�ncia total percorrida pelo autom�vel e o 
total de combust�vel gasto */

package exercicio3;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        float distancia;
        float combustivel;
        
        System.out.println("Digite a distancia total percorrida pelo automovel:");
        distancia = sc.nextFloat();
        System.out.println("Digite o total de combustivel gasto:");
        combustivel = sc.nextFloat();
        
        float consumo = distancia / combustivel;
        
        System.out.println("O consumo medio e de: " + consumo + "km/l");

    }
}
