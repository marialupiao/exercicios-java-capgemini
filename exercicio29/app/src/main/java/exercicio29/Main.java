/*  Fa�a um algoritmo que receba o n�mero do m�s e mostre o m�s correspondente.
  Valide m�s inv�lido */

package exercicio29;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int mes;
        
        System.out.println("Digite um numero: ");
        mes = sc.nextInt();
        
        switch (mes) {
            case 1:
                System.out.println("Mes de Janeiro");
                break;
            case 2:
                System.out.println("Mes de Fevereiro");
                break;
            case 3:
                System.out.println("Mes de Mar�o");
                break;
            case 4:
                System.out.println("Mes de Abril");
                break;
            case 5:
                System.out.println("Mes de Maio");
                break;
            case 6:
                System.out.println("Mes de Junho");
                break;
            case 7:
                System.out.println("Mes de Julho");
                break;
            case 8:
                System.out.println("Mes de Agosto");
                break;
            case 9:
                System.out.println("Mes de Setembro");
                break;
            case 10:
                System.out.println("Mes de Outubro");
                break;
            case 11:
                System.out.println("Mes de Novembro");
                break;
            case 12:
                System.out.println("Mes de Dezembro");
                break;
            default:
                System.out.println("Mes invalido");
                break;
        }
    }
}
