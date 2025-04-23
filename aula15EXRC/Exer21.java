package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		/* INCOMPLETO
		21.Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas
		de cada valor serão fornecidas. 
		
		As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.
		O programa não deve se preocupar com a quantidade de notas existentes na máquina.
		
		. Exemplo 1: Para sacar a quantia de 256 reais, o programa
		fornece duas notas de 100, uma nota de 50, uma nota de 5 e
		uma nota de 1;
		
		a. Exemplo 2: Para sacar a quantia de 399 reais, o programa
		fornece três notas de 100, uma nota de 50, quatro notas de 10,
		uma nota de 5 e quatro notas de 1
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de saque? Mínimo 10 e máximo 600");
		double quantidade = scan.nextDouble();
		
		if (quantidade >= 10 && quantidade <= 600) {
			
		} else {
			System.out.println("Mínimo 10 e máximo 600");
		}
		
	}

}
