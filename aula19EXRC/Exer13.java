package com.nicolas.cursojava.aula19EXRC;

public class Exer13 {

	public static void main(String[] args) {
		/*
		13.Criar um vetor A com 10 elementos inteiros. Implementar um programa
		que determine a soma dos elementos armazenados neste vetor que
		são múltiplos de 5.
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
		int soma = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] % 5 == 0) {
				soma += A[i];
			}
		}
		System.out.println(soma+" é o valor da soma.");

	}

}
