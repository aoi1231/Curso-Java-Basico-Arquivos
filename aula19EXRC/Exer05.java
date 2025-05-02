package com.nicolas.cursojava.aula19EXRC;

public class Exer05 {

	public static void main(String[] args) {
		/*
		5. Criar um vetor A com 10 elementos inteiros. 
		Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
		ser o respectivo elemento de A multiplicado por sua posição (ou
		índice), ou seja:
		B[i] = A[i] * i.
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
		
		for (int i = 0; i<A.length; i++) {
			B[i] = A[i] * i;
			System.out.println(B[i]);
		}
	}

}
