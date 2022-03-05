//5- Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int n1, n2;
		n2 =0;
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.print("Digite o número do teclado: ");
		n1 = leia.nextInt();
		n2 = n2 + n1;
		}
		while (n1!=0 );
		System.out.print("A soma dos números digitos é: " +n2 );
		
			
		
		

	}

}
