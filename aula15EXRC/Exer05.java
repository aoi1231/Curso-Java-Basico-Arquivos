package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		/* 5. Faça um programa para a leitura de duas notas parciais de um aluno.
		O programa deve calcular a média alcançada por aluno e apresentar:
			o A mensagem "Aprovado", se a média alcançada for maior ou
			igual a sete;
			o A mensagem "Reprovado", se a média for menor do que sete;
			o A mensagem "Aprovado com Distinção", se a média for igual a
			dez.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Primeiro nota parcial: ");
		int nota1 = scan.nextInt();
		System.out.println("Segunda nota parcial: ");
		int nota2 = scan.nextInt();
		int media = (nota1 + nota2)/2;
		
		if (media == 10) {
			System.out.println("Aprovado com distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}

}
