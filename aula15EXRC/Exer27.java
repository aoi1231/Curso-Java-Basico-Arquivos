package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		/*
		27.Uma fruteira está vendendo frutas com a seguinte tabela de preços:
		
			        Até 5 Kg         Acima de 5 Kg
			Morango R$ 2,50 por Kg   R$ 2,20 por Kg
			Maçã    R$ 1,80 por Kg   R$ 1,50 por Kg
			
			Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
			receberá ainda um desconto de 10% sobre este total. 
			
			Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o 
			valor a ser pago pelo cliente.
			*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos kg de morango? ");
		double kgMorangos = scan.nextDouble();
		System.out.println("Quantos kg de maças? ");
		double kgApples = scan.nextDouble();
		double valorMorangos = 0;
		double valorApples = 0;
		
		if (kgMorangos > 5) {
			valorMorangos = kgMorangos*2.2;
		} else {
			valorMorangos = kgMorangos*2.5;
		}
		
		if (kgApples > 5) {
			valorApples = kgApples*1.5;
		} else {
			valorApples = kgApples*1.8;
		}
		
		double total = valorMorangos + valorApples;
		if (kgMorangos + kgApples > 8 || valorMorangos + valorApples > 25)  {
			total = total - total*0.1;
		}
		
		System.out.println("deu " + total + "R$.");

	}

}
