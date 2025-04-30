package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		/*
		 * 37.Uma academia deseja fazer um senso entre seus clientes para
		descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, 
		para isto você deve fazer um programa que pergunte a cada um dos
		clientes da academia seu código, sua altura e seu peso.
		
		 O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no
		campo código. 
		
		Ao encerrar o programa também deve ser informados os códigos e valores do clente mais alto, 
		do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
        
	    //System.out.println("Lojas Tabajara");

		boolean sair = false;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago, troco;

		output = "Tabela\n";

		System.out.println("Digite a quantidade de clientes::");
		qtdProdutos = scan.nextInt();

		total = 0;

		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.println("Informe preço do produto " + i);
			preco = scan.nextDouble();
			total += preco;
			output += "Produto " + i + ": R$ " + preco + "\n";
		}

		output += "Total: R$ " + total;

		System.out.println("Total: R$ " + total);

		System.out.println("Entre com o valor pago:");
		valorPago = scan.nextDouble();

		output += "Dinheiro: R$ " + valorPago + "\n";

		troco = total - valorPago;

		output += "Troco: R$ " + troco;

		System.out.println(output);

		scan.close();
	}

}
