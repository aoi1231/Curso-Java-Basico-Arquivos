package com.nicolas.cursojava.aula19EXRC;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		/*
		20.Implementar um programa que obtenha a cotação do dólar (U$) em
		relação ao real (R$) e a seguir armazene em vetor A com 20
		elementos as seguintes conversões:
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o dolar hoje?");
		String output = "Conversões: \r\n";
		double dolar = scan.nextDouble();
		double reais = 0;
		double[] A = new double [20];
		
		for (int i = 0; i<A.length; i++) {
			System.out.println("Valor a ser convertido Nº " + (i+1));
			reais = scan.nextDouble();
			A[i] = reais/dolar;
			
			output += "\r\nO valor: R$ " + reais + " em dolar fica: $" + (reais/dolar);
		}
		System.out.println(output);

	}

}
