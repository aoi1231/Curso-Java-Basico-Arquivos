package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//8
		System.out.println("8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. \r\n"
				+ " Calcule e mostre o total do seu salário no referido mês. ");
		
		System.out.println("Quanto você ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		System.out.println("Quantas horas por mês você trabalha? ");
		double horas = scan.nextDouble();
		
		double salario = horas * ganhoHora;
		System.out.println("Seu salário é de " + salario + " reais.");
		
	}

}
