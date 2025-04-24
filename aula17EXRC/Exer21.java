package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		/*
		21.Faça um programa que peça um número inteiro e determine se ele é
		ou não um número primo. Um número primo é aquele que é divisível
		somente por ele mesmo e por 1.
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
