/* A concessionária de veículos “CARANGO” está vendendo os seus veículos com 
desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a 
ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo 
de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). 
Com valor do veículo zero encerra entrada de dados. Informe total de desconto e 
total pago pelos clientes */

package exercicio27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorVeiculo, valorDesconto, valorCliente;
        String tipoCombustivel;

        System.out.print("Digite o valor do veiculo sem o desconto: R$");
        valorVeiculo = sc.nextDouble();
        System.out.print("Digite o tipo de combustivel "
                + "(alcool, gasolina ou diesel): ");
        sc.nextLine();
        tipoCombustivel = sc.nextLine();

        while (valorVeiculo != 0) {
            if ("alcool".equals(tipoCombustivel)) {
                valorDesconto = valorVeiculo * 0.25;
                valorCliente = valorVeiculo - valorDesconto;
                System.out.println("O valor que o cliente devera pagar: R$"
                        + String.format("%.3f", valorCliente) 
                        + " Total descontos: R$"
                        + String.format("%.3f", valorDesconto));
            } else if ("gasolina".equals(tipoCombustivel)) {
                valorDesconto = valorVeiculo * 0.21;
                valorCliente = valorVeiculo - valorDesconto;
                System.out.println("O valor que o cliente devera pagar: R$"
                        + String.format("%.3f", valorCliente) 
                        + " Total descontos: R$"
                        + String.format("%.3f", valorDesconto));
            } else if ("diesel".equals(tipoCombustivel)) {
                valorDesconto = valorVeiculo * 0.14;
                valorCliente = valorVeiculo - valorDesconto;
                System.out.println("O valor que o cliente devera pagar: R$"
                        + String.format("%.3f", valorCliente) 
                        + " Total descontos: R$"
                        + String.format("%.3f", valorDesconto));
            }

        }
    }
}
