package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		/*
		32.Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		 
		Ex.: 5!=5.4.3.2.1=120. A saída deve ser
		conforme o exemplo abaixo:
		
		o Fatorial de: 5
		o 5! = 5 . 4 . 3 . 2 . 1 = 120
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = 0;
		n = scan.nextInt();
		System.out.println("Fatorial de: " + n);
		System.out.print(n + "! = ");
		int processo =n;
		
		for (; n!=1; n-=1) {
			System.out.print(n + " . ");
			processo = processo*(n-1);
		}
		
		System.out.println("1 = " + processo);
		scan.close();
	}

}
