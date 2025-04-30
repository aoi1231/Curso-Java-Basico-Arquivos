package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		/*
		17.Faça um programa que calcule o fatorial de um número inteiro
		fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fatorial de:");
		int n = scan.nextInt();
		
		System.out.print(n+"!=");
		System.out.print(n + ".");
		int resultado = n;
		int nAnt = n;
		n -=1;
		
		for (;n!=0; n-= 1) {
			
			if (n != 1) {
				System.out.print(n + ".");
			} else {
				System.out.print(n + "=");
			}
			nAnt = nAnt * n;
			resultado = nAnt;
		}
		System.out.print(resultado);
		scan.close();
	}

}
