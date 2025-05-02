package com.nicolas.cursojava.aula19EXRC;

public class Exer06 {

	public static void main(String[] args) {
		/*
		6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
		um vetor C, onde cada elemento de C é a soma dos respectivos
		elementos em A e B, ou seja:
		C[i] = A[i] + B[i].
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
		int[] B = new int [A.length];
		B[0] = 2;
		B[1] = 3;
		B[2] = 4;
		B[3] = 5;
		B[4] = 6;
		B[5] = 7;
		B[6] = 8;
		B[7] = 9;
		B[8] = 10;
		B[9] = 11;
		int[] C = new int [A.length];
		
		for (int i = 0; i<A.length; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}
	}
	

}
