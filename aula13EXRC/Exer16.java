package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//16
		System.out.println("16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área \r\n"
				+ " a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta e vendida \r\n"
				+ " em latas de 18 litros, que custam R$ 80,00, Informe ao usuário a quantidades de latas de tinta a serem compradas \r\n"
				+ " e o preço total. ");
		
		System.out.println("Qual o tamanho, em metros quadrados, da área a ser pintada?");
		double tamanhoM2 = scan.nextDouble();
		double latas = Math.ceil(tamanhoM2/3/18);
		double valor = latas * 80;
		
		System.out.println("Você vai precisar de " + (int)latas + " lata(s), que vai dar o total de R$: " + valor + ".");
		
	}

}
