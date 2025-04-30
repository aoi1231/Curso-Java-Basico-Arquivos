package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer51 {

	public static void main(String[] args) {
		//51.Faça um programa que mostre os n termos da Série a seguir: o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos termos?"); 
		int n = scan.nextInt();
		double soma = 1;
		
		System.out.print("S = 1/1"); 

		for (int i = 2, j = 3; i<=n; i++, j += 2) {
			System.out.print(" + " + i + "/" + j);
			soma += (double) i / (double) j;
		}
		
		System.out.print("\r\nSoma: " + soma);
		
		scan.close();
	}
}
