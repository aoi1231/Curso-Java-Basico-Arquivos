package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		/*
		17.Faça um Programa que peça um número correspondente a um
		determinado ano e em seguida informe se este ano é ou não bissexto. 
		
		 um ano é bissexto se for divisível por 4, exceto se 
		 for também divisível por 100, mas não por 400
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o ano? ");
		double ano = scan.nextDouble();
		
		
		if (ano%4 == 0) {
<<<<<<< HEAD
<<<<<<< HEAD
			if (ano%100 == 0  && ano% 400 != 0) {
=======
			if (ano%100 == 0  && ano%400 != 0) {
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
			if (ano%100 == 0  && ano% 400 != 0) {
>>>>>>> 35a4fb4 (Correção completa!)
				System.out.println("Seu ano não é bissexto. ");
			} else {
				System.out.println("Seu ano é bissexto. ");
			}
		} else {
			System.out.println("Seu ano não é bissexto. ");
		}

	}

}
