package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		/*
		24.Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
		O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
		
		. par ou ímpar;
		a. positivo ou negativo;
		b. inteiro ou decimal.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Me mande um numero inteiro ou decimal ");
		double numero1 = scan.nextDouble();
		System.out.println("Me mande outro numero inteiro ou decimal ");
		double numero2 = scan.nextDouble();
		System.out.println("Qual operação você deseja? (* / + -)");
		String operacao = scan.next();
<<<<<<< HEAD
		boolean valida = true;
=======
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
		
		double numero = 0;
		
		switch (operacao) {
		case "*": numero = numero1 * numero2; break;
		case "/": numero = numero1 / numero2; break;
		case "+": numero = numero1 + numero2; break;
		case "-": numero = numero1 - numero2; break;
<<<<<<< HEAD
		default: 
			System.out.println("Erro");
			valida = false;
		}
		
		if (valida = true) {
		
			String inteDeci = "inteiro";
			String parImpar = "par";
			String negaPosi = "positivo";
			
			if (numero % 1 == 0) {
				inteDeci = "inteiro";
			} else {
				inteDeci = "decimal";
			}
			
			if (numero%2 == 0) {
				parImpar = "par";
			} else {
				parImpar = "impar";
			}
			
			if (numero >= 0) {
				negaPosi = "positivo";
			} else {
				negaPosi = "negativo";
			}
			
			System.out.println("O resultado " + numero + " é " + parImpar + ", " + negaPosi + " e " + inteDeci + ".");
		}
=======
		default: System.out.println("Erro");
		}
		
		String inteDeci = "inteiro";
		String parImpar = "par";
		String negaPosi = "positivo";
		
		if (Math.round(numero) == numero) {
			inteDeci = "inteiro";
		} else {
			inteDeci = "decimal";
		}
		
		if (numero%2 == 0) {
			parImpar = "par";
		} else {
			parImpar = "impar";
		}
		
		if (numero >= 0) {
			negaPosi = "positivo";
		} else {
			negaPosi = "negativo";
		}
		
		System.out.println("O resultado " + numero + " é " + parImpar + ", " + negaPosi + " e " + inteDeci + ".");

>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
	}

}
