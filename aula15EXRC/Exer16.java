package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		/*
		16.Faça um programa que calcule as raízes de uma equação do segundo
		grau, na forma ax2 + bx + c. 
		O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
		
		a. Se o usuário informar o valor de A igual a zero, a equação não é
		do segundo grau e o programa não deve fazer pedir os demais
		valores, sendo encerrado;
		
		b. Se o delta calculado for negativo, a equação não possui raizes
		reais. Informe ao usuário e encerre o programa;
		
		c. Se o delta calculado for igual a zero a equação possui apenas
		uma raiz real; informe-a ao usuário;
		
		d. Se o delta for positivo, a equação possui duas raiz reais;
		informe-as ao usuário; */

		//Δ = b² - 4ac
		
		Scanner scan = new Scanner(System.in);
		
		double x;
		double delta;
		System.out.println("Qual o valor de A? ");
		double A = scan.nextDouble();
		
		if (A!=0) {
			System.out.println("Qual o valor de B? ");
			double B = scan.nextDouble();
			System.out.println("Qual o valor de C? ");
			double C = scan.nextDouble();
			
			delta = Math.pow(B, 2) - 4 * A * C;
			
			if (delta < 0) {
				System.out.println("a equação não possui raizes reais. ");
				
			} else if (delta == 0) {
				System.out.println("A equação possui apenas uma raiz real. ");
			} else {
				System.out.println("a equação possui duas raiz reais. ");
			}
		} else {
			System.out.println("A equação não é do segundo grau. ");
		}
		
		
	}

}
