package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		/*
		15.A série de Fibonacci é formada pela seqüência
		1+1+=2+=3+=5+=8+=13+=21
		1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
		até o n−ésimo termo.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("N termo:");
		int n = scan.nextInt();
		int numAnt= 1;
		int num = 1;
		int result = 0;
		System.out.print(num + " ");
		System.out.print(num + " ");
		
		for (int i = 3; i<=n; i++) {
			result = numAnt+num;
			numAnt = num;
			num = result;
			
			System.out.print(num + " ");
		}
		
		
	}

}
