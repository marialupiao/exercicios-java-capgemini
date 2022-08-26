/* Escreva um algoritmo que leia tr�s valores inteiros e verifique se eles podem
ser os lados de um tri�ngulo. Se forem, informar qual o tipo de tri�ngulo que 
eles formam: equil�tero, is�sceles ou escaleno. 
Propriedade: o comprimento de cada lado de um tri�ngulo � menor do que a soma 
dos comprimentos dos outros dois lados. 

a. Tri�ngulo Equil�tero: aquele que tem os comprimentos dos tr�s lados iguais; 
b. Tri�ngulo Is�sceles: aquele que tem os comprimentos de dois lados iguais.
c. Tri�ngulo equil�tero � tamb�m is�sceles; 
d. Tri�ngulo Escaleno: aquele que tem os comprimentos de seus tr�s lados diferentes;
*/

package exercicio32;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.println("Digite tres valores inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if ((a == 0 || b == 0 || c == 0) 
                || (a + b < c || a + c < b || b + c < a))  {
            System.out.println("Nao e um triangulo.");
        } else {
            System.out.println("E um triangulo.");
            if (a == b && a == c){
		System.out.println("Triangulo Equilatero");
	    }else if(a == b || b == c){
		System.out.println("Triangulo Isosceles");
		}else
		System.out.println("Triangulo Escaleno");     
        }
    }
}
