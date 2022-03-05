package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//variaveis
		int idade, pessoas=0, sexo,  opcao, cont1 =0, cont2 =0, cont3 =0, cont4 =0, cont5 =0, cont6 =0;
		Scanner leia = new Scanner(System.in);
		
		
		//entrada de dados
		    while(pessoas<2) { 
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.print("Digite seu sexo: ");
			sexo = leia.nextInt();
			
			System.out.print("Digite sua caracteristica psicológica: ");
			opcao = leia.nextInt();
			
			if (opcao==1)
				cont1++;
			
			if (sexo==1 && opcao==2)
				cont2++;
			
			if (sexo==2 && opcao==3)
				cont3++;
			
			if (sexo==3 && opcao==1)
				cont4++;
			
			if (idade>40 && opcao==2)
				cont5++;
			
			if (idade<18 && opcao==1)
				cont6++;
			pessoas++;
			
		}
		System.out.println("o número de pessoas calmas é: " +cont1);
		System.out.println("o número de mulheres nervosas é: " +cont2);
		System.out.println("o número de homens agressivos é: " +cont3);
		System.out.println("o número de outros calmos é: " +cont4);
		System.out.println("o número de pessoas nervosas com mais de 40 anos é: " +cont5);
		System.out.println("o número de pessoas calmas com menos de 18 anos é: " +cont6);
	}

}
