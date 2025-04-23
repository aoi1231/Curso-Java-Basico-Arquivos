package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		//6. Faça um Programa que leia três números e mostre o maior deles.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me mande 3 numeros DIFERENTES");
		System.out.println("Primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Segundo numero: ");
		int numero2 = scan.nextInt();
		System.out.println("Terceiro numero: ");
		int numero3 = scan.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O primeiro numero é o maior");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O segundo numero é o maior");
		} else {
			System.out.println("O terceiro numero é o maior");
		} 

	}

}
