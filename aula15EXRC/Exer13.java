package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		/*
		13.Faça um Programa que leia um número e exiba o dia correspondente
		da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
		aparecer valor inválido.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o dia da semana?");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sábado"); break;
		case 1: System.out.println("Domingo"); break;
		default: System.out.println("Valor Inválido.");
		}

	}

}
