package com.nicolas.cursojava.aula19EXRC;

public class Exer01 {

	public static void main(String[] args) {
		/*
		1. Criar um vetor A com 5 elementos inteiros.
		Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
		seja, B[i] = A[i].
		*/
		int[] A = new int [5];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		int[] B = new int [A.length];
		
		for (int i = 0; i<A.length; i++) {
			B[i] = A[i];
			System.out.println(B[i]);
		}
		

	}

}
