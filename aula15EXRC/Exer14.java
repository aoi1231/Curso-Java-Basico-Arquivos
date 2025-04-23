package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		/*
		14.Faça um programa que lê as duas notas parciais obtidas por um aluno
		numa disciplina ao longo de um semestre, e calcule a sua média. A
		atribuição de conceitos obedece à tabela abaixo:
		o Média de Aproveitamento Conceito
		o Entre 9.0 e 10.0 A
		o Entre 7.5 e 9.0 B
		o Entre 6.0 e 7.5 C
		o Entre 4.0 e 6.0 D
		o Entre 4.0 e zero E
		O algoritmo deve mostrar na tela as notas, a média, o conceito
		correspondente e a mensagem “APROVADO” se o conceito for
		A, B ou C ou “REPROVADO” se o conceito for D ou E. */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual sua primeira nota? ");
		double nota1 = scan.nextDouble();
		System.out.println("Qual sua segunda nota? ");
		double nota2 = scan.nextDouble();
		
		double media = (nota2 + nota1)/2;
		String conceito;
		String mensagem = "nada";
		
		if (media >= 9) {
			conceito = "A";
		} else if (media >= 7.5) {
			conceito = "B";
		} else if (media >= 6) {
			conceito = "C";
		} else if (media >= 4) {
			conceito = "D";
		} else {
			conceito = "E";
		}
		
		switch (conceito) {
		case "A":
		case "B":
		case "C": mensagem = "APROVADO"; break;
		case "D":
		case "E": mensagem = "REPROVADO"; break;
		}
		
		
		System.out.println("Notas: (" + nota1 + "), (" + nota2 + "). Média: (" + media + "). Conceito: (" + conceito + "). Você foi " + mensagem + ".");
	}

}
