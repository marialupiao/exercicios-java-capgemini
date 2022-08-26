/* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno 
durante o semestre. Calcular a sua média (aritmética), informar o nome e sua 
menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação 
media entre 5.1 a 6.9) */

package exercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double nota1, nota2, nota3, media;
        
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Digite as tres notas do aluno: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7) {
            System.out.println("O aluno " + nome + ", foi aprovado.");
        } else if (media < 6.9 && media > 5.1) {
            System.out.println("O aluno " + nome + ", esta de recuperacao");
        } else {
            System.out.println("O aluno " + nome + ", esta Reprovado");
        }  
    }
}
