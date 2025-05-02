package com.nicolas.cursojava.aula19EXRC;

public class Exer17 {

	public static void main(String[] args) {
		/*
		17.Ler um vetor A com 10 elementos inteiros correspondentes as idades
		de um grupo de pessoas. Escreva um programa que determine e
		escreva a quantidade de pessoas que possuem idade superior a 35
		anos.
		*/
		int[] A = new int [10];
		A[0] = 6;
		A[1] = 7;
		A[2] = 8;
		A[3] = 2;
		A[4] = 14;
		A[5] = 20;
		A[6] = 40;
		A[7] = 50;
		A[8] = 45;
		A[9] = 60;
		
		int qtSuperior = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] > 35) {
				qtSuperior++;
			} 
		}

		System.out.println(qtSuperior+" é a quantidade de pessoas com idade superiores a 15.");
	}

}
