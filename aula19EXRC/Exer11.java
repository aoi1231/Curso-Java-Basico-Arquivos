package com.nicolas.cursojava.aula19EXRC;

public class Exer11 {

	public static void main(String[] args) {
		/*
		11.Criar um vetor A com 10 elementos inteiros. 
		Implementar um programa que defina e escreva a quantidade de elementos armazenados neste
		vetor que são pares.
		*/
		int[] A = new int [10];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		A[5] = 6;
		A[6] = 7;
		A[7] = 8;
		A[8] = 9;
		A[9] = 10;
		int pares = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] % 2 == 0) {
				pares++;
			}
		}
		System.out.println(pares+" elementos são pares.");

	}

}
