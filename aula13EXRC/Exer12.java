package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//12
		System.out.println("12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal. ");
		//72.7*altura) - 58
		System.out.println("Qual sua altura?");
		double altura = scan.nextDouble();
		
		double alturaIdeal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é: " + alturaIdeal + "KG");
		
	}

}
