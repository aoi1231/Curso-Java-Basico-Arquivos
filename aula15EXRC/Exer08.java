package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		//8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me mande 3 preços DIFERENTES");
<<<<<<< HEAD
<<<<<<< HEAD
		
		System.out.println("Valor do primeiro produto: ");
		double produto1 = scan.nextDouble();
		System.out.println("Valor do segundo produto: ");
		double produto2 = scan.nextDouble();
		System.out.println("Valor do terceiro produto: ");
		double produto3 = scan.nextDouble();
=======
=======
		
>>>>>>> 35a4fb4 (Correção completa!)
		System.out.println("Valor do primeiro produto: ");
		double produto1 = scan.nextDouble();
		System.out.println("Valor do segundo produto: ");
		double produto2 = scan.nextDouble();
		System.out.println("Valor do terceiro produto: ");
<<<<<<< HEAD
		int produto3 = scan.nextInt();
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
		double produto3 = scan.nextDouble();
>>>>>>> 35a4fb4 (Correção completa!)
		
		if (produto1 < produto2 && produto1 < produto3) {
			System.out.println("O primeiro produto tem preço menor, você deve comprar.");
		} else if (produto2 < produto1 && produto2 < produto3) {
			System.out.println("O segundo produto tem preço menor, você deve comprar.");
		} else {
			System.out.println("O terceiro tem preço menor menor, você deve comprar.");
		} 
		

	}

}
