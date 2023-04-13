package javatech;

import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Hello Cold World!");
			
			System.out.print("Digite o Salario:");
			float salario = sc.nextFloat();
			
			System.out.print("Digite o Abono:");
			float abono = sc.nextFloat();
			
			double novosalario = salario + abono;
			
			System.out.printf("Novo Salario: %.2f%n", novosalario);
		}
		
		
	}

}
