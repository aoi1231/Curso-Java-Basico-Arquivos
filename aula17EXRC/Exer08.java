package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Numero inteiro 1:");
		int num1 = scan.nextInt();
		System.out.println("Numero inteiro 2:");
		int num2 = scan.nextInt();
		System.out.println("Numero inteiro 3:");
		int num3= scan.nextInt();
		System.out.println("Numero inteiro 4:");
		int num4 = scan.nextInt();
		System.out.println("Numero inteiro 5:");
		int num5 = scan.nextInt();
		*/
		int soma = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Entre com um número:");
			soma += scan.nextInt();
		}
		double media = soma/5;
		
		System.out.println("A soma é: " + soma + ". A média é: " + media + ".");

	}

}
