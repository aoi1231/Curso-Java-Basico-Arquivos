package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		/*
		11.As Organizações Tabajara resolveram dar um aumento de salário aos
		seus colaboradores e lhe contraram para desenvolver o programa que
		calculará os reajustes.
		o Faça um programa que recebe o salário de um colaborador e o
		reajuste segundo o seguinte critério, baseado no salário atual:
		o salários até R$ 280,00 (incluindo) : aumento de 20%
		o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		o salários de R$ 1500,00 em diante : aumento de 5%.
		
		Após o aumento ser realizado, informe na tela:
		o o salário antes do reajuste;
		o o percentual de aumento aplicado;
		o o valor do aumento;
		o o novo salário, após o aumento.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o seu salário para reajuste? ");
		int salario = scan.nextInt();
		
		int percentual = 0;
<<<<<<< HEAD
<<<<<<< HEAD
		double aumento = 0;
		double novoSalario = 0;
=======
		int aumento = 0;
		int novoSalario = 0;
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
		double aumento = 0;
		double novoSalario = 0;
>>>>>>> 35a4fb4 (Correção completa!)
		
		if (salario <= 280) {
			percentual = 20;
		} else if (salario <= 700) {
			percentual = 15;
		} else if (salario <= 1500) {
			percentual = 10;
		} else {
			percentual = 5;
		}
		
		aumento = salario/(100/percentual);
		novoSalario = salario + aumento;
		
		System.out.println("Seu salário é de " + salario + "R$.");
		System.out.println("O reajuste é de " + percentual + "%");
		System.out.println("Seu aumento é de " + aumento + "R$.");
		System.out.println("Seu novo salário é de " + novoSalario + "R$.");
<<<<<<< HEAD
<<<<<<< HEAD
=======
		
		
		
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
>>>>>>> 35a4fb4 (Correção completa!)

	}

}
