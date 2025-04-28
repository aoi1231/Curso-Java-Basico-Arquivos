package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer39 {

	public static void main(String[] args) {
		/*
		39.Faça um programa que leia dez conjuntos de dois valores, 
		
		o primeiro representando o número do aluno 
		o segundo representando a sua altura em centímetros.
		
		 Encontre o aluno mais alto e o mais baixo.
		 
		Mostre o número do aluno mais alto e o número do aluno mais baixo,
		junto com suas alturas.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int alunoBaixo = 0;
		double menor = Integer.MAX_VALUE;
		int alunoAlto = 0;
		double maior = Integer.MIN_VALUE;
		double altura = 0;
		
		for (int i = 1; i<=10; i++) {
			System.out.println("Me fale a altura do aluno Nº" + i);
			altura = scan.nextDouble();
			
			if (altura > maior) {
				alunoAlto = i;
				maior = altura;
			}
			if (altura < menor) {
				alunoBaixo = i;
				menor = altura;
			}
		}
		
		System.out.println("O aluno mais baixo foi o Nº" + alunoBaixo + ", com " + menor + " metros de altura.");
		System.out.println("Já o aluno mais alto foi o Nº" + alunoAlto + ", com " + maior + " metros de altura.");

	}

}
