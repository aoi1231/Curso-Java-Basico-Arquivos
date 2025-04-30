package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		/*
		23.Faça um programa que mostre todos os primos entre 1 e N sendo N
		um número inteiro fornecido pelo usuário. 
		
		O programa deverá mostrar também o número de divisões que ele executou 
		para encontrar os números primos.
		
		Serão avaliados o funcionamento, o estilo e o número
		de testes (divisões) executados.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero a partir de 1:");
		int n = scan.nextInt();
		
		if (n>0) {
			
			int resultado;
			int num = 1;
			int div = 0;
			
			for (; num <= n; num++) {
				resultado = 0;
				
				for (int i = 2; i <= num / 2; i++) {
					div++;
					if (num % i == 0) {
						resultado++;
						break;
					}
				}
				
				if (resultado == 0) {
					System.out.println("O numero " + num + " é um número primo.");
				} 
			}
			
			System.out.println("Numero de divisões: " + div);
		
		} else {
			System.out.println("Erro, o numero precisa ser a partir de 1.");
		}
		scan.close();
	}

}
