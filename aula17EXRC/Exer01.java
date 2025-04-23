package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		/*
		 1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
		mensagem caso o valor seja inválido e continue pedindo até que o
		usuário informe um valor válido. */
		
		Scanner scan = new Scanner(System.in);
		
		boolean teste = false;
		double nota;
		
		do {
			System.out.println("Uma nota entre zero e 10.");
			nota = scan.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				teste = true;
				System.out.println("Perfeito");
			} else {
				System.out.println("Inválido, a nota precisa ser entre 0 e 10.");
			}

		} while (!teste);
	}

}
