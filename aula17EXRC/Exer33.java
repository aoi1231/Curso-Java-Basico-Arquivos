package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		/*
		33.O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de
		temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
		*/
		
		double menor = Integer.MAX_VALUE;
		double maior = Integer.MIN_VALUE;
		double soma = 0;
		double temperatura;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero de temperaturas no conjunto: ");
		int n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Insira os graus da temperatura Nº" + i);
			temperatura = scan.nextDouble();
			
			if (temperatura < menor) {
				menor = temperatura;
			}
			if (temperatura > maior) {
				maior = temperatura;
			}
			soma += temperatura;
		}

		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Média de temperatura: " + soma/n);
		scan.close();
	}

}
