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
		
		int numero = 0;
		int alunoBaixo = 0;
		int menor = Integer.MAX_VALUE;
		int alunoAlto = 0;
		int maior = Integer.MIN_VALUE;
		int altura = 0;
		
		for (int i = 1; i<=10; i++) {
			System.out.println("Me fale o número do aluno Nº " + i);
			numero = scan.nextInt();
			System.out.println("Me fale a altura (em cm) do aluno Nº " + i);
			altura = scan.nextInt();
			
			
			if (altura > maior) {
				alunoAlto = numero;
				maior = altura;
			}
			if (altura < menor) {
				alunoBaixo = numero;
				menor = altura;
			}
		}
		
		System.out.println("O aluno mais baixo foi o aluno de Nº " + alunoBaixo + ", com " + menor + " centímetros de altura.");
		System.out.println("Já o aluno mais alto foi o aluno de Nº " + alunoAlto + ", com " + maior + " centímetros de altura.");
		scan.close();
	}

}
