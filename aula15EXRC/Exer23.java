package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		// 23.Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me mande um numero inteiro ou decimal ");
		double numero = scan.nextDouble();
		
<<<<<<< HEAD
		if (numero % 1 == 0) {
=======
		if (Math.round(numero) == numero) {
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
			System.out.println("Seu numero é inteiro");
		} else {
			System.out.println("Seu numero é decimal ");
		}
	}

}
