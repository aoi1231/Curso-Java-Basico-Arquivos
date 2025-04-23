package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//15
		System.out.println("15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e \r\n"
				+ "mostre o total do seu salário no referido més, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o \r\n"
				+ "INSS e 5% para o sindicato, faça um programa que nos dê: \r\n"
				+ "salário bruto. \r\n"
				+ "a. quanto pagou ao INSS. \r\n"
				+ "b. quanto pagou ao sindicato. \r\n"
				+ "c. o salário liquido. \r\n"
				+ "d. calcule os descontos e o salário liquido, conforme a tabela abaixo: \r\n"
				+ "+ Salário Bruto RS (11%): RS INSS (83) RE Liquido R Sindicato (5%) RS Salário \r\n"
				+ "Obs.: Salário Bruto Descontos Salário Liquido ");
		
		System.out.println("Quanto você ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		System.out.println("Quantas horas por mês você trabalha? ");
		double horas = scan.nextDouble();
		
		double salarioBruto = horas * ganhoHora;
		double ir = salarioBruto / (100/11);
		double INSS = salarioBruto / (100/8);
		double sindicato = salarioBruto / (100/5);
		double salarioLiquido = salarioBruto - INSS - sindicato - ir;
		
		System.out.println("Seu salário bruto é de " + salarioBruto + " reais.");
		System.out.println("Salário Bruto: " + salarioBruto + "R$, IR (11%): " + ir + "R$, INSS (8%): " + INSS + "R$, Sindicato (5%): \r\n"
		 + sindicato + "R$, Salário liquido:" + salarioLiquido + "R$.");
		
	}

}
