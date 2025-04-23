package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		/*
		26.Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		
		. Álcool:
		a. até 20 litros, desconto de 3% por litro
		b. acima de 20 litros, desconto de 5% por litro
		
		Gasolina:
		c. até 20 litros, desconto de 4% por litro
		d. acima de 20 litros, desconto de 6% por litro 
		
		Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, Ggasolina),
		calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos litros? ");
		int litros = scan.nextInt();
		System.out.println("A para álcol e G para gasolina. ");
		String tipo = scan.next();
		double valor = 0;
		
<<<<<<< HEAD
<<<<<<< HEAD
		if (tipo.equalsIgnoreCase("A")) {
=======
		if (tipo.equals("A")) {
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
		if (tipo.equalsIgnoreCase("A")) {
>>>>>>> 35a4fb4 (Correção completa!)
			if (litros > 20) {
				valor = (litros*1.9) - (litros*1.9)*0.05;
			} else {
				valor = (litros*1.9) - (litros*1.9)*0.03;
			}
<<<<<<< HEAD
<<<<<<< HEAD
		} else if (tipo.equalsIgnoreCase("G")) {
=======
		} else if (tipo.equals("G")) {
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
=======
		} else if (tipo.equalsIgnoreCase("G")) {
>>>>>>> 35a4fb4 (Correção completa!)
			if (litros > 20) {
				valor = (litros*2.5) - (litros*2.5)*0.06;
			} else {
				valor = (litros*2.5) - (litros*2.5)*0.04;
			}
		} else {
			System.out.println("erro");
		}
		
		System.out.println("Deu o total de " + valor + "R$.");
		
		
		

	}

}
