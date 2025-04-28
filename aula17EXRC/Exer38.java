package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer38 {

	public static void main(String[] args) {
		/*
		38.Um funcionário de uma empresa recebe aumento salarial anualmente:
			Sabe-se que:
			
			. Esse funcionário foi contratado em 1995, com salário inicial de
			R$ 1.000,00;
			a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
			b. A partir de 1997 (inclusive), os aumentos salariais sempre
			correspondem ao dobro do percentual do ano anterior. 
			Faça um programa que determine o salário atual desse funcionário. 
			
			Após
			concluir isto, altere o programa permitindo que o usuário digite o
			salário inicial do funcionário
			*/
		
		//1,5%
		//29 vezes
		
		Scanner scan = new Scanner(System.in);
		
		double n = 0.015;
		
		for (int i = 1; i<=29; i++) {
			n *= 2;
		}
		
		double salarioInicial = 1000*n;
		System.out.println("O salário, do funcionario de 1995, atualmente é de: R$ " + salarioInicial + ".");
		System.out.println("O aumento foi de: " + n + "%.");
		
		
		System.out.println("Insira um salário: ");
		salarioInicial = scan.nextDouble();
		double salario = salarioInicial*n;
		System.out.println("Seu salário atualmente é de: R$ " + salario + ".");
		System.out.println("O aumento foi de: " + n + "%.");
		

	}

}
