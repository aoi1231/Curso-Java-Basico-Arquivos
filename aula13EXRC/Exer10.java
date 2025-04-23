package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//10
		System.out.println("10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit. ");
		
		System.out.println("Quantos graus celsius?");
		double celsius = scan.nextDouble();
		//F = C x 1,8 + 32
		double fahrenheit = celsius * 1.8 + 32;
		System.out.println(celsius + " graus celciu é equivalente á " + fahrenheit + " graus fahrenheit.");
	}
}
