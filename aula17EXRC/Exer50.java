package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer50 {

	public static void main(String[] args) {
		// 50.Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos termos?"); 
		int n = scan.nextInt();
		double H = 1;
		
		for (int i = 1; i<=n; i ++) {
			i++;
			H += (double) 1/i;
		}
		
		System.out.print("\r\nSoma: " + H);

		scan.close();
	}

}
