package com.nicolas.cursojava.aula19EXRC;

public class Exer23 {

	public static void main(String[] args) {
		/*
		23.Criar um vetor A com 10 elementos inteiros.
		 Desenvolver um programa
		que verifique se "todos" os elementos do vetor A são pares. Se pelo
		menos um elemento do vetor não for par o processo de repetição para
		percorrer os elementos do vetor deve ser encerrado, como sugestão:
		utilize uma variável do tipo flag para atingir este propósito.
		*/
		int [] A = new int [10];
		A[0] = 2;
		A[1] = 2;
		A[2] = 4;
		A[3] = 4; 
		A[4] = 6;
		A[5] = 6;
		A[6] = 6;
		A[7] = 8;
		A[8] = 8;
		A[9] = 10;
		
		boolean flag = false;
		
		for (int i = 0; i<A.length; i++) {
			if (A[i] % 2 != 0) {
				flag = true;
				break;
			}
		}
		
		if (flag == false) {
			System.out.println("Encerrado, sem ímpares");
		} else {
			System.out.println("Encerrado, com ímpares");
		}
		
	}

}
