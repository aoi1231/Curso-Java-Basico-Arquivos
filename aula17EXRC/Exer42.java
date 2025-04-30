package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer42 {

	public static void main(String[] args) {
		/*
		42.Faça um programa que leia uma quantidade indeterminada de números positivos e conte quantos deles estão nos seguintes
		intervalos: 
		[0-25], [26-50], [51-75] e [76-100]. 
		A entrada de dados deverá terminar quando for lido um número negativo.
		*/
		
		int numero = 0;
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		do {
			System.out.print("Digite um número inteiro: ");
			numero = scan.nextInt();
			
			if (numero >= 0 && numero <=25) {
				a++;
			} else if (numero >= 26 && numero <=50) {
				b++;
			} else if (numero >= 51 && numero <=75) {
				c++;
			} else if (numero >= 76 && numero <=100) {
				d++;
			}
		} while (numero >= 0);
		
		System.out.print("Estão nos seguintes intervalos: ");
		System.out.print("[0-25] = " + a + ", [26-50] = " + b + ", [51-75] = " + c + ", [76-100] = " + d + ".");

		scan.close();
	}

}
