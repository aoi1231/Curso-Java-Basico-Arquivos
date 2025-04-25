package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		/*
		28.Faça um programa que calcule o valor total investido por um
		colecionador em sua coleção de CDs e o valor médio gasto em cada
		um deles. 
		
		O usuário deverá informar a quantidade de CDs e o valor
		para em cada um.
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de cd's na sua coleção:");
		int n = scan.nextInt();
		double valorInfo;
		double soma = 0;
		
		for (int i = 1 ; i<=n; i++) {
			System.out.println("Valor do cd Nº" + i + ":");
			valorInfo = scan.nextInt();
			soma += valorInfo;
		}
		
		double media = soma/n;
		System.out.println("A média de gasto por cd é: " + media + "R$.");

	}

}
