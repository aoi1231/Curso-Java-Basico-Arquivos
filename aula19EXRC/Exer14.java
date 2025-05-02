package com.nicolas.cursojava.aula19EXRC;

public class Exer14 {

	public static void main(String[] args) {
		/*
		14.Criar um vetor A com 10 elementos inteiros. Implementar um programa
		que defina e escreva a média aritmética simples dos elementos
		ímpares armazenados neste vetor.
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
		int impares = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] % 2 != 0) {
				soma += A[i];
				impares++;
			}
		}
		
		double media = soma/impares;
		System.out.println(media+" é a média.");


	}

}
