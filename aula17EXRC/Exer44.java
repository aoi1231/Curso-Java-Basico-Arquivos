package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer44 {

	public static void main(String[] args) {
		/*
		44.Em uma eleição presidencial existem quatro candidatos. 
		Os votos são informados por meio de código. 
		
		Os códigos utilizados são:
		o 1, 2, 3, 4 - Votos para os respectivos candidatos
		o (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
		o 5 - Voto Nulo
		o 6 - Voto em Branco
		
		Faça um programa que calcule e mostre:
		o O total de votos para cada candidato;
		o O total de votos nulos;
		o O total de votos em branco;
		o A percentagem de votos nulos sobre o total de votos;
		o A percentagem de votos em branco sobre o total de votos.
		 
		Para finalizar o conjunto de votos tem-se o valor zero.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de códigos \r\n");
		int voto = 1;
		int nicolas = 0, matheus = 0, calebe = 0, miguel = 0, nulos = 0, brancos = 0;
		int total = 0;
		double calculo;
		
		do {
			System.out.println(" 1 - Nicolas Vitor \r\n 2 - Matheus Henrique \r\n 3 - Calebe da Silva\r\n 4 - Miguel Henrique \r\n 5 - Voto Nulo \r\n 6 - Voto em Branco \r\n 0 - Acabar votação \r\n");
			System.out.println("Qual o código?");
			voto = scan.nextInt();

			total++;
			switch (voto) {
			case 1:
				nicolas++;
				break;
			case 2:
				matheus++;
				break;
			case 3:
				calebe++;
				break;
			case 4:
				miguel++;
				break;
			case 5:
				nulos++;
				break;
			case 6:
				brancos++;
				break;
			default:
				total--;
			}

		} while (voto != 0);
		
		System.out.println("Votos do candidato Nicolas Vitor: " + nicolas);
		System.out.println("Votos do candidato Matheus Henrique: " + matheus);
		System.out.println("Votos do candidato Calebe da Silva: " + calebe);
		System.out.println("Votos do candidato Miguel Henrique: " + miguel);
		System.out.println("Votos nulos: " + nulos);
		System.out.println("Votos em branco: " + brancos);
		calculo =  ((double)nulos/total)*100;
		System.out.println("Percentagem de votos nulos sobre o total de votos: " + calculo + "%.");
		calculo = ((double)brancos/total)*100;
		System.out.println("Percentagem de votos em branco sobre o total de votos: " + calculo + "%.");
		
		scan.close();
	}

}
