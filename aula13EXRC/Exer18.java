package com.nicolas.cursojava.aula13EXRC;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//18
		System.out.println("18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um \r\n"
				+ "link de Internet (em Mbps), calcule e Informe o tempo aproximado de download do arquivo usando este link (em minutos).");
		
		System.out.println("Qual o tamanho do arquivo em mb?");
		double mb = scan.nextDouble();
		System.out.println("Qual a velocidade em mbs?");
		double mbs = scan.nextDouble();
		//vm = d/t
		//t = mb/mbs
		double t = (mb/mbs)/60;
		System.out.println("O tempo é de " + t + " minutos.");
	}

}
