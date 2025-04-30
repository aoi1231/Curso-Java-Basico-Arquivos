package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int soma = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Entre com um número:");
			soma += scan.nextInt();
		}
		double media = soma/5;
		
		System.out.println("A soma é: " + soma + ". A média é: " + media + ".");

		scan.close();
	}

}
