package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//13
		System.out.println("13. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso \r\n"
				+ "ideal, utilizando as seguintes fórmulas: \r\n"
				+ "Para homens: (72.7*h) - 58 \r\n"
				+ "a. Para mulheres: (62.1*h)-44.7 (h = altura) \r\n"
				+ "b. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso. ");
		
		System.out.println("Qual é seu peso?");
		double peso = scan.nextDouble();
		System.out.println("Qual sua altura?");
		double altura2 = scan.nextDouble();
		
		double paraHomens = (72.7 * altura2) - 58;
		double paraMulheres = (62.1 * altura2) - 44.7;
		
		System.out.println("1 pra masculino, 2 pra feminino");
		int homemOuMulher = scan.nextInt();
		
		if (homemOuMulher == 1) {
			if (peso>paraHomens) {
				System.out.println("Você está acima do peso.");
			} else if (peso<paraHomens) {
				System.out.println("Você está abaixo do peso.");
			} else if (peso == paraHomens) {
				System.out.println("Você está com o peso ideal, parabéns!");
			}
		} else if (homemOuMulher == 2) {
			if (peso>paraMulheres) {
				System.out.println("Você está acima do peso.");
			} else if (peso<paraMulheres) {
				System.out.println("Você está abaixo do peso.");
			} else if (peso == paraMulheres) {
				System.out.println("Você está com o peso ideal, parabéns!");
			}
		} else {
			System.out.println("Erro");
		}
		
	}

}
