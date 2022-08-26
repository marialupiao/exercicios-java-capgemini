/* Escreva um algoritmo que leia o nome de um aluno e as notas das três provas 
que ele obteve no semestre. No final informar o nome do aluno e a sua média 
(aritmética) */

package exercicio5;

import java.util.Scanner;

   public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double nota1, nota2, nota3;
        
        System.out.println("Digite o nome do(a) aluno(a): ");
        nome = sc.nextLine();
        System.out.println("Digite as tres notas do(a) aluno(a): ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3.0;
        
        System.out.println("Nome do(a) aluno(a): " + nome);
        System.out.println("Media: " + String.format("%.1f", media));
    }
}
