/* Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este 
n�mero seja maior que 10 */

package exercicio13;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        double numero;
        
        System.out.print("Digite um numero: ");
        numero = sc.nextDouble();
        
        if (numero > 10) {
            System.out.println("Este numero e maior que 10");
        } 
    }
}
