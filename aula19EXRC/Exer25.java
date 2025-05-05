package com.nicolas.cursojava.aula19EXRC;

public class Exer25 {

	public static void main(String[] args) {
		/*
		25.Criar um vetor A com 10 elementos inteiros.
		 Construir um vetor B de
		mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
		
		a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0
		quando Ai for ímpar.
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
		int [] B = new int [10];
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] % 2 == 0) {
				B[i] = 1;
			} else {
				B[i] = 0;
			}
		}
		for (int i = 0; i<A.length; i++) {
			System.out.print(A[i] + " ");
			
		}
		System.out.println();
		for (int i = 0; i<A.length; i++) {
			System.out.print(B[i] + " ");
			
		}

	}

}
