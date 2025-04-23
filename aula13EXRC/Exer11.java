package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer11 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		//11
		System.out.println("11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre: \r\n"
				+ "a. o produto do dobro do primeiro com metade do segundo. \r\n"
				+ "b. a soma do triplo do primeiro com o terceiro. \r\n"
				+ "c. o terceiro elevado ao cubo. ");
		
		System.out.println("Numero inteiro 1: ");
		int numeroInteiro = scan.nextInt();
		System.out.println("Numero inteiro 2: ");
		int numeroInteiro2 = scan.nextInt();
		System.out.println("Numero real: ");
		double numeroReal = scan.nextDouble();
		
		int resultadoA = (2*numeroInteiro) * (2/numeroInteiro2);
		double resultadoB = (3*numeroInteiro) + numeroReal;
		double resultadoC = Math.pow(numeroReal, 3);
		
		System.out.println("A = " + resultadoA);
		System.out.println("B = " + resultadoB);
		System.out.println("C = " + resultadoC);
		
	}
	
}
