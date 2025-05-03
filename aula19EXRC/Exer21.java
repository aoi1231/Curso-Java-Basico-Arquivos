package com.nicolas.cursojava.aula19EXRC;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		//21.A[i] = cotação do dolar * i, para todo i variando de 1 até 20
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o dolar hoje?");
		String output = "Conversões: \r\n";
		double dolar = scan.nextDouble();
		double reais = 0;
		double[] A = new double [20];
		
		for (int i = 0; i<A.length; i++) {
			System.out.println("Valor a ser convertido Nº " + (i+1));
			reais = scan.nextDouble();
			A[i] = dolar*i;
			
			output += "\r\nO valor: R$ " + reais + " em dolar fica: $" + (reais/dolar);
		}
		System.out.println(output);

	}

}
