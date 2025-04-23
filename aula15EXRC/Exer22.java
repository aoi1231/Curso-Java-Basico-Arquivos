package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		// 22.Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me mande um numero inteiro");
		int numero = scan.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

	}

}
