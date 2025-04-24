package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		/*
		18.Faça um programa que, dado um conjunto de N números, determine o
		menor valor, o maior valor e a soma dos valores.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de numeros: ");
		int i= scan.nextInt();
		
		int num;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int soma = 0;
		
		for (; i!=0; i-= 1) {
			System.out.println("Entre com um número:");
			num = scan.nextInt();
			soma += num;
			
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
			
			
		}
		
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);
		System.out.println("A soma dos valores foi: " + soma);
		

	}

}
