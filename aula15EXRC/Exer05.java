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
<<<<<<< HEAD
<<<<<<< HEAD
		double nota1 = scan.nextDouble();
		System.out.println("Segunda nota parcial: ");
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2)/2;
=======
		int nota1 = scan.nextInt();
		System.out.println("Segunda nota parcial: ");
		int nota2 = scan.nextInt();
		int media = (nota1 + nota2)/2;
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
		double nota1 = scan.nextDouble();
		System.out.println("Segunda nota parcial: ");
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2)/2;
>>>>>>> 35a4fb4 (Correção completa!)
		
		if (media == 10) {
			System.out.println("Aprovado com distinção");
		} else if (media >= 7) {
<<<<<<< HEAD
<<<<<<< HEAD
			System.out.println("Aprovado ");
		} else {
			System.out.println("Reprovado ");
=======
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
			System.out.println("Aprovado ");
		} else {
			System.out.println("Reprovado ");
>>>>>>> fcc2f5d (Test)
		}
	}

}
