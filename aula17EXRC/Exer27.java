package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		/*
		27.Faça um programa que calcule o número médio de alunos por turma.
		Para isto, peça a quantidade de turmas e a quantidade de alunos para
		cada turma. 
		As turmas não podem ter mais de 40 alunos
		*/
		Scanner scan = new Scanner(System.in);
		
		int estudantes = 0;
		System.out.println("Quantidade de turmas:");
		int turmas = scan.nextInt();
		int estudantesTurma;
		
		boolean invalido = true;
		
		for (int i=0; i<turmas; i++) {
			invalido = true;
			do {
				System.out.println("Quantos estudantes tem a turma " + (i+1) + "?");
				estudantesTurma = scan.nextInt();
				
				if (estudantesTurma <= 40) {
					invalido = false;
				} else {
					
					System.out.println("Erro! Essa turma tem mais que 40 estudantes.");
				}
				
			} while(invalido);
			estudantes += estudantesTurma;
		} 
		
		double media = estudantes/turmas;
		System.out.println("A média de estudantes por turma é de " + media + " estudantes.");
		scan.close();
	}

}
