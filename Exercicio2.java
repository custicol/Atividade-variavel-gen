package javatech;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Hello Cold World!");
			
			System.out.print("Digite a Primeira Nota:");
			double nota1 = sc.nextDouble();
			
			System.out.print("Digite a Segunda Nota:");
			double nota2 = sc.nextDouble();
			
			System.out.print("Digite a Terceira Nota:");
			double nota3 = sc.nextDouble();
			
			System.out.print("Digite a Quarta Nota:");
			double nota4 = sc.nextDouble();
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.println();
			System.out.printf("Media Final: %.1f", media);
		}
			
	}

}
