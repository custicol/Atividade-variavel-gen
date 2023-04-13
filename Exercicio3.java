package javatech;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Hello Cold World!");
			
			System.out.print("Digite o Salario Bruto:");
			double salario = sc.nextDouble();
			
			System.out.print("Digite o Adicional Noturno:");
			double adcnot = sc.nextDouble();
			
			System.out.print("Digite a Hora Extra:");
			double hrextra = sc.nextDouble();
			
			System.out.print("Digite o Desconto:");
			double desconto = sc.nextDouble();
			
			double salarioliquido = salario + adcnot + (hrextra * 5) - desconto;
			System.out.println();
			System.out.printf("Salario Liquido: %.2f", salarioliquido);
		}

	}

}
