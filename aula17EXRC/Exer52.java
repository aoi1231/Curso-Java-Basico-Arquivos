package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer52 {

	public static void main(String[] args) {
		//52.Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos termos?"); 
		int n = scan.nextInt();
		int n2 = 1;
		double H = 1;
		
		System.out.print("H = 1"); 
		
		for (int i = 1; i<=n; i ++) {
			n2 ++;
			System.out.print(" + 1/" + n2);
			H += (double) 1/n2;
		}
		
		System.out.print("\r\nSoma: " + H);

		scan.close();
	}
}
