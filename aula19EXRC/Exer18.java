package com.nicolas.cursojava.aula19EXRC;

public class Exer18 {

	public static void main(String[] args) {
		/*
		18.Ler um vetor A com 10 elementos inteiros correspondentes as idades
		de um grupo de pessoas. Escreva um programa que determine e
		escreva a menor e a maior idades e suas respectivas posições.
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
		
		int menor = Integer.MAX_VALUE;
		int posMenor = 0;
		int maior = Integer.MIN_VALUE;
		int posMaior = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] > maior) {
				maior = A[i];
				posMaior = i;
			} 
			if (A[i] < menor) {
				menor = A[i];
				posMenor = i;
			} 
		}

		System.out.println(menor+" é a menor idade. Posição: " + posMenor);
		System.out.println(maior+" é a maior idade. Posição: " + posMaior);

	}

}
