package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		/*
		15.Faça um Programa que peça os 3 lados de um triângulo. O programa
		deverá informar se os valores podem ser um triângulo. Indique, caso
		os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
		escaleno.
		
		o Dicas:
		o Três lados formam um triângulo quando a soma de quaisquer
		dois lados for maior que o terceiro;
		o Triângulo Equilátero: três lados iguais;
		o Triângulo Isósceles: quaisquer dois lados iguais;
		o Triângulo Escaleno: três lados diferentes;*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o primeiro lado? ");
		double lado1 = scan.nextDouble();
		System.out.println("Qual o segundo lado? ");
		double lado2 = scan.nextDouble();
		System.out.println("Qual o terceiro lado? ");
		double lado3 = scan.nextDouble();
		
		if ((lado1 + lado2)> lado3 ||  (lado2 + lado3)> lado1 ||  (lado3 + lado1)> lado2){
			System.out.println("É um triângulo. ");
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("É um triângulo Equilátero: três lados iguais.");
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("É um triângulo Isósceles: Quaisquer dois lados iguais.");
			} else {
				System.out.println("É um triângulo Escaleno: Três lados diferentes. ");
			}
		} else {
			System.out.println("Não é um triângulo ");
		}

	}

}
