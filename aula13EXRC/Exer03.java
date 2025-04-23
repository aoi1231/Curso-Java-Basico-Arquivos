package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//3
		System.out.println("3. Faça um Programa que peça dois números e imprima a soma.");
		
		System.out.println("Numero 1: ");
		int numero1 = scan.nextInt();
		System.out.println("Numero 2: ");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma é: " + (numero1 + numero2));
	}

}
