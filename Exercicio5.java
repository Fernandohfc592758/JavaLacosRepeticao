//5- Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)

package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int n1, n2;
		n2 =0;
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.print("Digite o n�mero do teclado: ");
		n1 = leia.nextInt();
		n2 = n2 + n1;
		}
		while (n1!=0 );
		System.out.print("A soma dos n�meros digitos �: " +n2 );
		
			
		
		

	}

}
