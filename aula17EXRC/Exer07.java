package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// 7. Faça um programa que leia 5 números e informe o maior número
		
		Scanner scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++) {
			System.out.println("Entre com um número:");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
				
			}
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		
		
		
	}

}
