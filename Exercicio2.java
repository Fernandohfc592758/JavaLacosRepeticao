package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

public static void main(String[] args) {
		
	Scanner leia= new Scanner(System.in);
	int num, numPar=0, numImpar=0;
	
	for(int x = 0;x <10; x++) {
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		if (num % 2 == 0)
			numPar++;
		else
			numImpar++;
	}
	System.out.print("S�o "+ numPar+" n�meros pares e "+numImpar+" n�meros �mpares");
}
}