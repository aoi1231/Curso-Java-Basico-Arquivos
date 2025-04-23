package com.nicolas.cursojava.aula15EXRC;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
public class Exer28 {

	public static void main(String[] args) {
		/*
		28.O Hipermercado Tabajara está com uma promoção de carnes que é
		imperdível. Confira:
		
		o            Até 5 Kg        Acima de 5 Kg
		o File Duplo R$ 4,90 por Kg  R$ 5,80 por Kg
		o Alcatra    R$ 5,90 por Kg  R$ 6,80 por Kg
		o Picanha    R$ 6,90 por Kg  R$ 7,80 por Kg
		
		Para atender a todos os clientes, cada cliente poderá levar
		apenas um dos tipos de carne da promoção, porém não há
		limites para a quantidade de carne por cliente. 
		
<<<<<<< HEAD
		Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 0.05 sobre o total a compra. 
		
		Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, 
		contendo as informações da compra: 
		
		tipo e quantidade de carne,
		preço total, 
		tipo de pagamento, 
		 valor do desconto e valor a pagar.
		 
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual carne? file, alcatra ou picanha. ");
		String tipo = scan.next();
		if (tipo.equalsIgnoreCase("file") || tipo.equalsIgnoreCase("alcatra") || tipo.equalsIgnoreCase("picanha")) {
		
			System.out.println("Quantos kg de carne? ");
			double kg = scan.nextDouble();
			
			//Valor
			double valor = 0;
			
			if (tipo.equalsIgnoreCase("file") ) {
				if (kg > 5) {
					valor = kg * 5.8;
				} else {
					valor = kg * 4.9;
				}
			} else if (tipo.equalsIgnoreCase("alcatra") ) {
				if (kg > 5) {
					valor = kg * 6.8;
				} else {
					valor = kg * 5.9;
				}
			} else if (tipo.equalsIgnoreCase("picanha") ) {
				if (kg > 5) {
					valor = kg * 7.8;
				} else {
					valor = kg * 6.9;
				}
			}
			
			//Desconto
			double desconto = 0;
			
			System.out.println("Qual forma de pagamento? ");
			String forma = scan.next();
			switch (forma) {
			case ("cartão"): desconto = valor * 0.05;
			}
			
			double total = valor - desconto;
			
			System.out.println("<CUPOM FISCAL>");
			System.out.println("Tipo da carne: " + tipo + ", quantidade: " + kg + "kg.");
			System.out.println("Preço total: " + valor + "R$.");
			System.out.println("Forma de pagamento: " + forma + ".");
			System.out.println("Valor do desconto: " + desconto + "R$, total a pagar: " + total + "R$.");
			
		}
=======
		Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. 
		
		Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal,
		contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do
		desconto e valor a pagar.
		*/
		
		

>>>>>>> 000ee0e (Refazendo uploads so que em .java e não em .class)
	}

}
