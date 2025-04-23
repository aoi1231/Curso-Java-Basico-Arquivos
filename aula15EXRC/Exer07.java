package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		//7. Faça um Programa que leia três números e mostre o maior e o menor deles.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me mande 3 numeros DIFERENTES");
<<<<<<< HEAD
<<<<<<< HEAD
		
=======
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
		
>>>>>>> 35a4fb4 (Correção completa!)
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
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("O primeiro numero é o menor");
		} else if (numero2 < numero1 && numero2 < numero3) {
			System.out.println("O segundo numero é o menor");
		} else {
			System.out.println("O terceiro numero é o menor");
		} 
	}

}
