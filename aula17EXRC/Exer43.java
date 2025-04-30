package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer43 {

	public static void main(String[] args) {
		/*
		 * 43.O cardápio de uma lanchonete é o seguinte:
		 * 
		o Especificação 	Código 	Preço
		
		o Cachorro Quente 	100 	R$ 1,20
		o Bauru Simples		101 	R$ 1,30
		o Bauru com ovo 	102 	R$ 1,50
		o Hambúrguer 		103 	R$ 1,20
		o Cheeseburguer 	104 	R$ 1,30
		o Refrigerante 		105 	R$ 1,00
		
		Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. 
		
		Mostre o valor a ser pago por
		item (preço * quantidade)
		 e o total geral do pedido.
		
		Considere que o cliente deve informar quando o pedido deve ser encerrado.
		 */

		Scanner scan = new Scanner(System.in);
		
		int item = 0;
		int quantidade = 0;
		double preco = 0;
		double calculo = 0;
		double total = 0;
		String comprovante = "\r\nComprovante \r\n";
		
		do {
			System.out.print("Código do item que você vai pedir (Deixe 0 se quiser fechar): ");
			// Pedido
			item = scan.nextInt();
			if (item != 0) {
				System.out.print("Quantos? ");
				quantidade = scan.nextInt();

				// Preço
				switch (item) {
				case 100:
				case 103:
					preco = 1.2;
					break;
				case 101:
				case 104:
					preco = 1.3;
					break;
				case 102:
					preco = 1.5;
					break;
				case 105:
					preco = 1;
					break;
				}

				calculo = preco * quantidade;
				total += calculo;
				comprovante += item + " X " + quantidade + " = R$ "+ calculo + "\r\n";
			}
		} while(item != 0);
		System.out.print(comprovante + "Total: R$ " + total);
		
		scan.close();
	}

}
