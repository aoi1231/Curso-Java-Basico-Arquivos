package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer46 {

	public static void main(String[] args) {
		/*
		 * 46.Em uma competição de salto em distância cada atleta tem direito a cinco
		 * saltos. No final da série de saltos de cada atleta, o melhor e o pior
		 * resultados são eliminados. O seu resultado fica sendo a média dos três
		 * valores restantes.
		 * 
		 * Você deve fazer um programa que receba o nome e as cinco distâncias
		 * alcançadas pelo atleta em seus saltos e depois informe a média dos saltos
		 * conforme a descrição acima informada (retirar o melhor e o pior salto e
		 * depois calcular a média).
		 * 
		 * Faça uso de uma lista para armazenar os saltos. Os saltos são informados na
		 * ordem da execução, portanto não são ordenados. O programa deve ser encerrado
		 * quando não for informado o nome do atleta.
		 * 
		 * A saída do programa deve ser conforme o exemplo abaixo:
		 * 
		 * Atleta: Rodrigo Curvêllo 
		 * Primeiro Salto: 6.5 m
		 *  Segundo Salto: 6.1 m
		 *   Terceiro Salto: 6.2 m 
		 *   Quarto Salto: 5.4 m 
		 *   Quinto Salto: 5.3 m 
		 *   Melhor salto: 6.5 m 
		 *   Pior salto: 5.3 m
		 *    Média dos demais saltos: 5.9 m
		 * 
		 * Resultado final: Rodrigo Curvêllo: 5.9 m
		 */

		//Variáveis
		Scanner scan = new Scanner(System.in);
		String saida = "";
		String nome = "oi";
		double maior;
		double menor;
		double distancia;
		double total = 0;
		double media;

		//Código
		do {
			System.out.println("Qual o nome do atleta? (digite 'sair' para encerrar.)");
			nome = scan.next();
			
			if (!nome.equalsIgnoreCase("sair")) {
				maior = Integer.MIN_VALUE;
				menor = Integer.MAX_VALUE;
				total = 0;
				
				saida += ("\r\n\r\nAtleta: " + nome);
				
				for (int salto = 1; salto <= 5; salto++) {
					System.out.println("Qual a distância do salto Nº" + salto + "? ");
					distancia = scan.nextDouble();

					total += distancia;

					if (distancia > maior) {
						maior = distancia;
					}
					if (distancia < menor) {
						menor = distancia;
					}

					saida += "\r\n" + salto + "º salto: " + distancia + " m";
				}

				media = (total-maior-menor)/3;
				saida += "\r\nMelhor salto: " + maior + " m";
				saida += "\r\nPior salto: " + menor + " m";
				saida += "\r\nMédia dos demais saltos: " + media + " m";
				saida += "\r\n\r\nResultado final: " + nome + ": " + media + " m";
			}
		} while (!nome.equalsIgnoreCase("sair"));

		//Output
		if (total > 0) {
			System.out.println(saida);
		}
		
		
		scan.close();
	}
}
