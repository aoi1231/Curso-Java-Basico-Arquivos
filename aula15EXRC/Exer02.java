package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		//2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Me mande um número");
		int numero = scan.nextInt();
		
		if (numero >= 0) {
			System.out.println("O numero " + numero + " é positivo.");
		} else {
			System.out.println("O numero " + numero + " é negativo.");
		}
	}

}
