package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		//14.Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
		int par = 0;
		int impar = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Entre com um número:");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		
		System.out.println("Quantidade de numero pares: " + par + ". Quantidade de numeros ímpares: " + impar + ".");
	}

}
