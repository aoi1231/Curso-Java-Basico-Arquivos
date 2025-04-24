package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		/*
		24.Faça um programa que calcule o mostre a média aritmética de N
		notas.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de notas:");
		int n = scan.nextInt();
		double nota;
		double notas = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Insira nota " + (i+1) + ":");
			nota = scan.nextDouble();
			notas += nota;
			
		}
		
		double media = notas/n;
		System.out.println("A média aritimética de " + n + " notas é: " +  media + ".");

	}

}
