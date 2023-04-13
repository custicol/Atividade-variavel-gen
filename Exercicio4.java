package javatech;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello Cold World!");
		
		System.out.print("Digite um Numero:");
		float n1 = sc.nextFloat();
		
		System.out.print("Digite um Numero:");
		float n2 = sc.nextFloat();
		
		System.out.print("Digite um Numero:");
		float n3 = sc.nextFloat();
		
		System.out.print("Digite um Numero:");
		float n4 = sc.nextFloat();
		
		double calculo = (n1 * n2) - (n3 * n4);
		System.out.println();
		System.out.printf("Diferença: %.1f", calculo);
		
		
		
	}

}
