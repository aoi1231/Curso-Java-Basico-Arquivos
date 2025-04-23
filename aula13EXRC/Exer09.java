package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//9
		System.out.println("9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme a temperatura em graus Celsius.");
		
		System.out.println("Qual a temperatura em graus Fahrenheit? ");
		double temperaturaF = scan.nextDouble();
		
		double celcius = 5*(temperaturaF-32)/9;
		System.out.println("Em graus Celsius fica: " + celcius + " graus.");
		
	}

}
