package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		/*
		22.Altere o programa de cálculo dos números primos, informando, caso o
		número não seja primo, por quais número ele é divisível
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero:");
		int num = scan.nextInt();
		int resultado = 0;
		
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("é divisível por " + i);
				resultado++;
			}
		}
		
		if (resultado == 0) {
			System.out.println("é um número primo");
		} else {
			System.out.println("não é um número primo");
		}
		
		scan.close();

	}

}
