package com.nicolas.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1-7)");
		int diaSemana = scan.nextInt();
		/*
		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("terça");
		} else if (diaSemana == 4) {
			System.out.println("quarta");
		} else if (diaSemana == 5) {
			System.out.println("quinta");
		} else if (diaSemana == 6) {
			System.out.println("sexta");
		} else if (diaSemana == 8) {
			System.out.println("sábado");
		} else {
			System.out.println("Não é um dia válido.");
		}
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Não é um dia válido.");
		}
		*/
		switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil"); break; 
		case 1:
		case 7: System.out.println("fim de semana"); break;
		default: System.out.println("Não é um dia válido.");
		}
	}

}
