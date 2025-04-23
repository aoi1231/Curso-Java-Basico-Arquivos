package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		//8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me mande 3 preços DIFERENTES");
		System.out.println("Valor do primeiro produto: ");
		int produto1 = scan.nextInt();
		System.out.println("Valor do segundo produto: ");
		int produto2 = scan.nextInt();
		System.out.println("Valor do terceiro produto: ");
		int produto3 = scan.nextInt();
		
		if (produto1 < produto2 && produto1 < produto3) {
			System.out.println("O primeiro produto tem preço menor, você deve comprar.");
		} else if (produto2 < produto1 && produto2 < produto3) {
			System.out.println("O segundo produto tem preço menor, você deve comprar.");
		} else {
			System.out.println("O terceiro tem preço menor menor, você deve comprar.");
		} 
		

	}

}
