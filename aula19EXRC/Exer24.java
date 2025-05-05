package com.nicolas.cursojava.aula19EXRC;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		/*
		24.Números palíndromos são aqueles que escritos da direita para a
		esquerda têm o mesmo valor quando escritos da esquerda para a
		direita. Exemplo: 545; 789987; 97379; 123454321; etc. 
		Escreva um
		programa que verifique se um dado vetor A de 10 elementos inteiros é
		um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
		último, se o segundo elemento do vetor é igual ao penúltimo e assim
		por diante até verificar todos os elementos ou chegar a conclusão que
		o vetor não é um palíndromo.
		*/
		Scanner scan = new Scanner(System.in);
		int [] A = new int [10];

		for (int i = 0; i<A.length; i++) {
			System.out.println("Elemento Nº " + (i+1) + ":");
			A[i] = scan.nextInt();
		}
		for (int i = 0; i<A.length; i++) {
		}

	}

}
