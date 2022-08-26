/* Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 
funcionários de acordo com os seguintes critérios: 
a. 50% para aqueles que ganham menos do que três salários mínimos; 
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários.

Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha 
de pagamento */

package exercicio28;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Serao digitados os dados de quantos funcionarios? ");
        n = sc.nextInt();

        double[] salario = new double[n];
        double[] novoSalario = new double[n];
        double[] reajuste = new double[n];
        String[] nome = new String[n];
        double salarioMinimo;

        System.out.print("Digite o valor do salario minimo: R$");
        salarioMinimo = sc.nextDouble();

        for (int i = 0; i < n; i++) {

            System.out.print("Digite o nome do funcionario: ");
            sc.nextLine();
            nome[i] = sc.nextLine();

            System.out.print("Digite o salario do funcionario: R$");
            salario[i] = sc.nextDouble();

        }
        double contagem = 0;

        for (int i = 0; i < n; i++) {
            if (salario[i] < (3.0 * salarioMinimo)) {
                reajuste[i] = salario[i] * 0.45;
                novoSalario[i] = salario[i] + reajuste[i];
            } else if (salario[i] >= (3.0 * salarioMinimo)
                    && salario[i] >= (10.0 * salarioMinimo)) {
                reajuste[i] = salario[i] * 0.20;
                novoSalario[i] = salario[i] + reajuste[i];
            } else if (salario[i] > (10.0 * salarioMinimo)
                    && salario[i] > (20.0 * salarioMinimo)) {
                reajuste[i] = salario[i] * 0.15;
                novoSalario[i] = salario[i] + reajuste[i];
            } else {
                reajuste[i] = salario[i] * 0.10;
                novoSalario[i] = salario[i] + reajuste[i];
            }

            System.out.println("O(a) funcionario(a) " + nome[i]
                    + ", recebeu um reajuste de R$" 
                    + reajuste[i]
                    + ", o valor do novo salario e de: R$" 
                    + String.format("%.3f", novoSalario[i]));

            contagem = contagem + reajuste[i];
        }

        System.out.println("A empresa tera um aumento de R$" 
                + String.format("%.3f",contagem)
                + " na sua folha de pagamento");
    }

}
