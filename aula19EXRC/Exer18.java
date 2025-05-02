package com.nicolas.cursojava.aula19EXRC;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		/*
		18.Ler um vetor A com 10 elementos inteiros correspondentes as idades
		de um grupo de pessoas. Escreva um programa que determine e
		escreva a menor e a maior idades e suas respectivas posições.
		*/
		int[] idades = new int [10];
		Scanner scan = new Scanner(System.in);
		
		for (int i =0; i<idades.length; i++) {
			System.out.println("Idade da pessoa Nº " + (i+1));
			idades[i] = scan.nextInt();
		}
		
		int menor = Integer.MAX_VALUE;
		int posMenor = 0;
		int maior = Integer.MIN_VALUE;
		int posMaior = 0;
		
		for (int i = 0; i<idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				posMaior = i;
			} 
			if (idades[i] < menor) {
				menor = idades[i];
				posMenor = i;
			} 
		}

		System.out.println(menor+" é a menor idade. Posição: " + posMenor);
		System.out.println(maior+" é a maior idade. Posição: " + posMaior);

	}

}
