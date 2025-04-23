package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//14
		System.out.println("14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu \r\n"
				+ "trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de \r\n"
				+ "São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia \r\n"
				+ "a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o \r\n"
				+ "valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.");
		
		System.out.println("Qual o peso do peixe? ");
		double pesoPeixe = scan.nextDouble();
		double multa = 0;
		double excesso = 0;
		
		if (pesoPeixe>50) {
			excesso = pesoPeixe - 50;
			System.out.println("O peixe passou do limite de peso, você teve um excesso de " + excesso + "kg.");
			multa = excesso * 4;
			System.out.println("Sua multa ficou em " + multa + " reais.");
		} else {
			System.out.println("Dentro do permitido, sua multa ficou em " + multa + " reais e o excesso ficou em " + excesso + "kg.");
		}
		
	}

}
