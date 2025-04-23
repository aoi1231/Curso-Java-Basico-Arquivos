package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		/*
		20.Faça um Programa para leitura de três notas parciais de um aluno. O
		programa deve calcular a média alcançada por aluno e presentar:
		
		. A mensagem "Aprovado", se a média for maior ou igual a 7,
		com a respectiva média alcançada;
		
		a. A mensagem "Reprovado", se a média for menor do que 7, com
		a respectiva média alcançada;
		
		b. A mensagem "Aprovado com Distinção", se a média for igual a
		10.
		*/

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota 1? ");
		double nota1 = scan.nextDouble();
		System.out.println("Nota 2? ");
		double nota2 = scan.nextDouble();
		System.out.println("Nota 3? ");
		double nota3 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção com a média: " + media);
		} else if (media >= 7) {
			System.out.println("Aprovado com a média: " + media);
		} else {
			System.out.println("Reprovado com a média: " + media);
		}

	}

}
