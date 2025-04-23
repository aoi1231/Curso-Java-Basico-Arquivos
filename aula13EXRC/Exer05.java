package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//5
		System.out.println("5. Faça um Programa que converta metros para centimetros. ");
		
		System.out.println("Quantos metros? ");
		double metros = scan.nextDouble();
		
		System.out.println(metros + " metros dá " + (metros * 100) + " centímetros.");
			
	}

}
