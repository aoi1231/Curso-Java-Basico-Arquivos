package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		/*
		13.Faça um programa que peça dois números, base e expoente, calcule e
		mostre o primeiro número elevado ao segundo número. Não utilize a
		função de potência da linguagem.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Base:");
		int base = scan.nextInt();
		System.out.println("Expoente:");
		int expoente = scan.nextInt();
		
		int numero = base;
		
		for (; expoente > 1; expoente -= 1) { 
			base *= numero;
		}
		
		System.out.println("O numero " + numero + " elevado á " + expoente + " é igual a " + base);

		scan.close();
	}

}
