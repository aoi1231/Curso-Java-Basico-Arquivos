package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		/*
		18.Faça um Programa que peça uma data no formato dd/mm/aaaa e
		determine se a mesma é uma data válida 
		
		2 = 28 dias, exceto em anos bissextos, quando tem 29 dias
		1 
		3
		5
		7
		8
		10
		12 = 31 dias
		4 =
		6 = 
		9 = 
		11 = 30 dias
		*/

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o dia? ");
		int dia = scan.nextInt();
		System.out.println("Qual o mês? ");
		int mes = scan.nextInt();
		System.out.println("Qual o ano? ");
		int ano = scan.nextInt();
		
		int diasValidos = 0;
		boolean bissexto;
		
		if (dia > 0 && ano >= 0) {
			if (mes > 0 && mes < 13) {
				
				//ano bissexto
				if (ano%4 == 0) {
					if (ano%100 == 0  && ano%400 != 0) {
						bissexto = false;
					} else {
						bissexto = true;
					}
				} else {
					bissexto = false;
				}
				
				//dias no mês
				switch (mes) {
				case 1:
				case 3: 
				case 5:
				case 7: 
				case 8:
				case 10:
				case 12: diasValidos = 31; break;
				case 4:
				case 6: 
				case 9:
				case 11: diasValidos = 30; break;
				}
				
				if (mes == 2) {
					if (bissexto == false) {
						diasValidos = 28;
					} else {
						diasValidos = 29;
					}
				}
				
				//dia válido
				if (dia <= diasValidos) {
					System.out.println("Data válida: " + dia + "/" + mes + "/" + ano);

				} else {
					System.out.println("Data inválida.");
				}
			} else {
				System.out.println("Data inválida.");
			}
		} else {
			System.out.println("Data inválida.");
		}
		
		
		
		
	}

}
