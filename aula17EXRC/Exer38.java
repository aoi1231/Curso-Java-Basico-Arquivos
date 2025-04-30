package com.nicolas.cursojava.aula17EXRC;

import java.text.DecimalFormat;
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
		DecimalFormat format = new DecimalFormat ("###,###.##");
		
		double n = 0.015;
		double salario = 1000;
		
		salario += salario * n;
		for (int i = 1997; i<=2025; i++) {
			n *= 2;
			salario += salario*n;
		}
		
		System.out.println("O salário, do funcionario de 1995, atualmente é de: R$ " + format.format(salario) + ".");
		System.out.println("O aumento foi de: " + (n*100) + "%.");
		
		//Alterado
		System.out.println("Insira um salário: ");
		salario = scan.nextDouble();
		n = 0.015;
		
		salario += salario * n;
		for (int i = 1997; i<=2025; i++) {
			n *= 2;
			salario += salario*n;
		}
		
		System.out.println("Seu salário atualmente é de: R$ " + format.format(salario) + ".");
		System.out.println("O aumento foi de: " + (n*100) + "%.");

		scan.close();
	}

}
