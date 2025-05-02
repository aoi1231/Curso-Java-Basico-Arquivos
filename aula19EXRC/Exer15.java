package com.nicolas.cursojava.aula19EXRC;

public class Exer15 {

	public static void main(String[] args) {
		/*
		15.Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
		que defina o percentual de elementos pares e ímpares,
		respectivamente, armazenados neste vetor.
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
		int impares = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		double percentualImpares = (double) impares/A.length*100;
		double percentualPares = (double) pares/A.length*100;
		System.out.println(percentualImpares+"% é impar.");
		System.out.println(percentualPares+"% é par.");


	}

}
