package com.nicolas.cursojava.aula19EXRC;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		/*
		17.Ler um vetor A com 10 elementos inteiros correspondentes as idades
		de um grupo de pessoas. Escreva um programa que determine e
		escreva a quantidade de pessoas que possuem idade superior a 35
		anos.
		*/
		Scanner scan = new Scanner(System.in);
		int[] A = new int [10];
		
		for (int i =0; i<A.length; i++) {
			System.out.println("Idade da pessoa Nº " + (i+1));
			A[i] = scan.nextInt();
		}
		int qtSuperior = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] > 35) {
				qtSuperior++;
			} 
		}

		System.out.println(qtSuperior+" é a quantidade de pessoas com idade superiores a 35.");
	}

}
