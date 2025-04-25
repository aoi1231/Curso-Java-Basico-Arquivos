package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		/*
		34.Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. 
		Um número primo é aquele que é divisível apenas por um e por ele mesmo. 
		Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero:");
		int num = scan.nextInt();
		int resultado = 0;
		
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				resultado++;
			}
		}
		
		if (resultado == 0) {
			System.out.println("é um número primo");
		} else {
			System.out.println("não é um número primo");
		}
	}

}
