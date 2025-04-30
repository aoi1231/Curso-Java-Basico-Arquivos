package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer40 {

	public static void main(String[] args) {
		/*
		40.Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
		 
		Foram obtidos os seguintes dados:
		. Código da cidade;
		a. Número de veículos de passeio (em 1999);
		b. Número de acidentes de trânsito com vítimas (em 1999). 
		
		Deseja-se saber:
		c. Qual o maior e menor índice de acidentes de transito e a que cidade pertence:
		d. Qual a média de veículos nas cinco cidades juntas;
		e. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
		*/

		Scanner scan = new Scanner(System.in);
		//String output;
		double maior = Integer.MIN_VALUE; //Índice de acidentes
		double menor = Integer.MAX_VALUE; //Índice de acidentes
		double somaV = 0;
		double somaA = 0;
		double calculo;
		int aC = 0;
		int maiorCodigo = 0; //Índice de acidentes
		int menorCodigo = 0; //Índice de acidentes
		int codigo;
		int veiculos;
		int acidentes;
		
		for (int i = 1; i<=5; i++) {
			System.out.println("Qual o código da cidade? ");
			codigo = scan.nextInt();
			System.out.print("Número de veículos de passeio (em 1999): ");
			veiculos = scan.nextInt();
			System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");
			acidentes = scan.nextInt();
			
			calculo = ((double) acidentes / veiculos);
			
			if (calculo > maior) {
				maior = calculo;
				maiorCodigo = codigo;
			}
			if (calculo < menor) {
				menor = calculo;
				menorCodigo = codigo;
			}
			
			somaV += veiculos;
			if (veiculos < 2000) {
				somaA += acidentes;
				aC++;
			}
		}
		System.out.println("Maior índice de acidentes cidade: " + maiorCodigo);
		System.out.println("Maior índice de acidentes: " + maior);
		System.out.println("Menor índice de acidentes cidade: " + menorCodigo);
		System.out.println("Menor índice de acidentes: " + menor);
		System.out.println("Média de veículos nas 5 cidades: " + (somaV/5));
		if (aC > 0) {
		    System.out.println("Média de acidentes em cidades com menos de 2000 veículos: " + (somaA / aC));
		} else {
		    System.out.println("Nenhuma cidade com menos de 2000 veículos.");
		}
		
		scan.close();
	}

}
