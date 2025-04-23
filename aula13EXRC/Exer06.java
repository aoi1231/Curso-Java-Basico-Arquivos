package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//6
		System.out.println("6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. ");
		
		System.out.println("Qual o raio?");
		double raio = scan.nextDouble();
		//A=π⋅r2
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área é: " + area);
		
	}

}
