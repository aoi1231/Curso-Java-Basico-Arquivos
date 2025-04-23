package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//17
		System.out.println("17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da \r\n"
				+ "área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta \r\n"
				+ "é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25.00. \r\n"
				+ " Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações: \r\n"
				+ " comprar apenas latas de 18 litros: \r\n"
				+ " comprar apenas galões de 3,6 litron \r\n"
				+ " misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% de folga e sempre arredonde os valores \r\n"
				+ "para cima, isto é, considere latas chelas. ");
		
		System.out.println("Qual o tamanho, em metros quadrados, da área a ser pintada?");
		double tamanhoM2 = scan.nextDouble();
		
		//latas 18 litros
		double latas18 = Math.ceil((tamanhoM2 + tamanhoM2/10)/6/18);
		double valor18 = latas18 * 80;
		
		//latas 3.6 litros
		double latas3 = Math.ceil((tamanhoM2 + tamanhoM2/10)/6/3.6);
		double valor3 = latas3 * 25;
		
		//mistura
		double litros = (tamanhoM2 + tamanhoM2/10)/6;
		
		int latasM18 = (int) (litros / 18);
		double restante = litros - (latasM18 * 18);
		int latasM3 = (int) Math.ceil(restante / 3.6);

		
		double valorM = latasM18 * 80 + latasM3 * 25;
		
		//output
		System.out.println("Você vai precisar de " + latas18 + " latas de 18, que vai dar o total de " + valor18 + "R$.");
		System.out.println("Você vai precisar de " + latas3 + " latas de 3.6, que vai dar o total de " + valor3 + "R$.");
		System.out.println("Você vai precisar de " + latasM18 + " latas de 18 litros mais " + latasM3 + " latas de 3.6 litros, Que vai dar o total de " + valorM + "R$.");
		
	}

}
