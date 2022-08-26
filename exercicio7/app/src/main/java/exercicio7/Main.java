/* Leia uma temperatura em graus Celsius e apresentá-la convertida em graus 
Fahrenheit. A fórmula de conversão é:F = (9*C+160) / 5, sendo F a temperatura em 
Fahrenheit e C a temperatura em Celsius; */

package exercicio7;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double celsius;
        
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = sc.nextDouble();
        
        double fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("Temperatura equivalente em Fahrenheit: "
                + fahrenheit);
        
    }
}
