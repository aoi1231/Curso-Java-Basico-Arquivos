package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		/*
		35.Encontrar números primos é uma tarefa difícil. 
		Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero a partir de 1:");
		int n = scan.nextInt();
		
		if (n>0) {
			
			int resultado;
			int num = 1;
			
			for (; num <= n; num++) {
				resultado = 0;
				
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						resultado++;
						break;
					}
				}
				
				if (resultado == 0) {
					System.out.println(num);
				} 
			}
		
		} else {
			System.out.println("Erro, o numero precisa ser a partir de 1.");
		}

	}

}
