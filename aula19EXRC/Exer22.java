package com.nicolas.cursojava.aula19EXRC;

public class Exer22 {

	public static void main(String[] args) {
		/*
		22.Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
		0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1);
		 Pede-se
		para implementar um programa que determine o percentual de
		números 0's e 1's existentes no vetor A
		*/
		int [] A = new int [10];
		int zero = 0;
		int um = 0;
		
		for (int i = 0; i<A.length; i++) {
			A[i] = (int)Math.round(Math.random() * 1); // Gera 0 ou 1
			if (A[i] == 0) {
				zero++;
			} else {
				um++;
			}
			
		}
		System.out.println("O percentual de zeros existentes é de " + ((double) zero/A.length*100) + "%.");
		System.out.println("O percentual de um's existentes é de " + ((double) um/A.length*100) + "%.");

	}

}
