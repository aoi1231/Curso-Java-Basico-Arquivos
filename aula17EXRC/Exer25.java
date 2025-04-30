package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		/*
		25.Faça um programa que peça para n pessoas a sua idade, ao final o
		programa devera verificar se a média de idade da turma varia entre 0 e
		25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
		ou idosa, conforme a média calculada.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de idades:");
		int n = scan.nextInt();
		int idade;
		int idades = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Insira uma idade.");
			idade = scan.nextInt();
			idades += idade;
		}
		
		double media = idades/n;
		String turma = "jovem";
		if (media > 60) {
			turma = "idosa";
		} else if (media > 25) {
			turma = "adulta";
		}
		
		System.out.println("A média de idade da turma de " + n + " pessoas é: " +  media + ". Portanto, a turma é " + turma + ".");

		scan.close();
	}

}
