/* Escreva um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo e o 
total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este 
vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o seu nome,
o sal�rio fixo e sal�rio no final do m�s */

package exercicio4;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double salarioFixo;
        double salarioFinal;
        double vendas;
        
        System.out.print("Digite o nome do vendedor: ");
        nome = sc.nextLine();
        System.out.print("Digite o salario fixo do vendedor: ");
        salarioFixo = sc.nextDouble();
        System.out.print("Digite o total de vendas efetuadas (por mes): ");
        vendas = sc.nextDouble();
        
        double comissao = vendas * 15 / 100;
        
        salarioFinal = salarioFixo + comissao;
        
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salario fixo: R$" + salarioFixo);
        System.out.println("Salario final: R$" + salarioFinal);
        
    }
}
