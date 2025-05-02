package com.nicolas.cursojava.aula19EXRC;

public class Exer03 {

	public static void main(String[] args) {
		/*
		3. Criar um vetor A com 15 elementos inteiros. 
		Construir um vetor B de mesmo tipo e tamanho, 
		sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, 
		ou seja:
		B[i] = A[i] * A[I].
		*/

		int[] A = new int [15];
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
		A[10] = 11;
		A[11] = 12;
		A[12] = 13;
		A[13] = 14;
		A[14] = 15;
		int[] B = new int [15];
		
		for (int i = 0; i<A.length; i++) {
			B[i] = A[i] * A[i];
			System.out.println(B[i]);
		}
	}

}
