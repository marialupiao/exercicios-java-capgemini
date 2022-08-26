
package Vinte;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagem = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar;
        
        int totalSemiNovos = 0;
        int totalCarros = 0;
        
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            System.out.println("Digite o ano de fabricacao do veiculo: ");
            anoFabricacao = sc.nextInt();
            System.out.println("Digite o valor do veiculo: ");
            valorVeiculo = sc.nextFloat();
            
            if (anoFabricacao <= 2000) {
                porcentagem = 0.12f;
            } else {
                porcentagem = 0.07f;
                totalSemiNovos++;
            }
            
            totalCarros++;
            
            valorDesconto = valorVeiculo * porcentagem;
            valorPagar = valorVeiculo - valorDesconto;
            
            System.out.println("O valor do desconto foi de: R$" + valorDesconto);
            System.out.println("O valor que deve ser pago e de: R$" + valorPagar);
            
            System.out.println("Deseja fazer mais cadastros (S/N)? ");
            desejaRepetir = sc.next().charAt(0);
            
        } 
        System.out.println("Total de carros semi novos: " + totalSemiNovos);
        System.out.println("Total de carros: " + totalCarros);   
    }
}
