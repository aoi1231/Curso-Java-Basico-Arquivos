package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		/*
		12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do
		salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado
		(é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
		O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
		
		o Desconto do IR:
		o Salário Bruto até 900 (inclusive) - isento
		o Salário Bruto até 1500 (inclusive) - desconto de 5%
		o Salário Bruto até 2500 (inclusive) - desconto de 10%
		o Salário Bruto acima de 2500 - desconto de 20% 
		
		Imprima na tela as informações, dispostas conforme o exemplo abaixo.
		No exemplo o valor da hora é 5 e a quantidade de hora é 220.
		
		Salário Bruto: (5 * 220) : R$ 1100,00
		(-) IR (5%) : R$ 55,00
		(-) INSS ( 10%) : R$ 110,00
		FGTS (11%) : R$ 121,00
		Total de descontos : R$ 165,00
		Salário Liquido : R$ 935,00
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		int ganhoHora = scan.nextInt();
		System.out.println("Quantas horas você trabalha?");
		int horas = scan.nextInt();
		
		double salarioBruto = ganhoHora * horas;
		double ir;
		
		if (salarioBruto <= 900) {
			ir = 0;
		} else if (salarioBruto <= 1500) {
			ir = 0.05;
		} else if (salarioBruto <= 2500) {
			ir = 0.1;
		} else {
			ir = 0.2;
		}
		
		double irRes = salarioBruto * ir;
		double inss = salarioBruto * 0.1;
		double fgts = salarioBruto * 0.11;
		double total = irRes + inss;
		double salarioLiquido = salarioBruto - total;
		
		System.out.println("Salário bruto : (" + ganhoHora + " * " + horas + "): R$ " + salarioBruto);
		System.out.println("(-) IR (5%) : R$ " + irRes);
		System.out.println("(-) INSS (10%) : R$ " + inss);
		System.out.println("FGTS (11%) : R$ " + fgts);
		System.out.println("Total de descontos : R$ " + total);
		System.out.println("Salário liquido : R$ " + salarioLiquido);
	}

}
