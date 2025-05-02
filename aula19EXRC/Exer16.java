package com.nicolas.cursojava.aula19EXRC;

public class Exer16 {

	public static void main(String[] args) {
		/*
		16.Criar um vetor A com 10 elementos inteiros. Escrever um programa
		que calcule e escreva:
		
		 a) a soma de elementos armazenados neste vetor que são inferiores a 15;
		 b) a quantidade de elementos armazenados no vetor que são iguais a 15; 
		c) a média dos elementos armazenados no vetor que são superiores a 15.
		*/
		int[] A = new int [10];
		A[0] = 6;
		A[1] = 7;
		A[2] = 8;
		A[3] = 2;
		A[4] = 14;
		A[5] = 15;
		A[6] = 15;
		A[7] = 16;
		A[8] = 18;
		A[9] = 20;
		
		int somaInferior = 0;
		int igual = 0;
		int somaSuperior = 0;
		int qtSuperior = 0;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] < 15) {
				somaInferior += A[i];
			} else if (A[i] == 15) {
				igual++;
			} else {
				somaSuperior += A[i];
				qtSuperior++;
			}
		}
		
		double media = (double) somaSuperior/qtSuperior;
		System.out.println(somaInferior+" é a soma dos numeros inferiores a 15.");
		System.out.println(igual+" é a quantidade dos numeros iguais a 15.");
		System.out.println(media+" é a media dos numeros superiores a 15.");

	}

}
