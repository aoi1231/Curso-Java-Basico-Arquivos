package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		//1. Faça um Programa que peça dois números e imprima o maior deles
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me mande 2 numeros");
		System.out.println("Primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Segundo numero: ");
		int numero2 = scan.nextInt();
		
		int maior = Math.max(numero1, numero2);
		System.out.println("O maior número é: " + maior);
			
		
	}

}