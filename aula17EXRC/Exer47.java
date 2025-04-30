package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer47 {

	public static void main(String[] args) {
		/*
		47.Em uma competição de ginástica, cada atleta recebe votos de sete jurados.
		
		A melhor e a pior nota são eliminadas. 
		A sua nota fica sendo a média dos votos restantes.
		(retirar o melhor e o pior salto e depois calcular a média com as notas restantes). 
		As notas não são informados ordenadas. 
		
		Você deve fazer um programa que receba o nome do ginasta e as notas dos sete 
		jurados alcançadas pelo atleta em sua apresentação e depois informe a sua média, 
		conforme a descrição acima informada 
		
		
		Um exemplo de saída do programa deve ser conforme o exemplo abaixo:
		
		Atleta: Aparecido Parente
		Nota: 9.9
		Nota: 7.5
		Nota: 9.5
		Nota: 8.5
		Nota: 9.0
		Nota: 8.5
		Nota: 9.7
		Resultado final:
		Atleta: Aparecido Parente
		Melhor nota: 9.9
		Pior nota: 7.5
		Média: 9,04
		*/
		
		//Variáveis
		Scanner scan = new Scanner(System.in);
		String saida = "";
		String nome = "oi";
		double maior;
		double menor;
		double nota;
		double total = 0;
		double media;

		// Código
		do {
			System.out.println("Qual o nome do atleta? (digite 'sair' para encerrar.)");
			nome = scan.next();

			if (!nome.equalsIgnoreCase("sair")) {
				maior = Integer.MIN_VALUE;
				menor = Integer.MAX_VALUE;
				total = 0;

				saida += ("\r\n\r\nAtleta: " + nome);

				for (int jurado = 1; jurado <= 7; jurado++) {
					System.out.println("Qual a nota do jurado Nº" + jurado + "? ");
					nota = scan.nextDouble();

					total += nota;

					if (nota > maior) {
						maior = nota;
					}
					if (nota < menor) {
						menor = nota;
					}

					saida += "\r\nNota: " + nota;
				}

				media = (total - maior - menor) / 5;
				saida += "\r\nResultado final: " + "\r\nAtleta: " + nome;
				saida += "\r\nMelhor nota: " + maior;
				saida += "\r\nPior nota: " + menor;
				saida += "\r\nMédia: " + media;

			}
		} while (!nome.equalsIgnoreCase("sair"));

		// Output
		if (total > 0) {
			System.out.println(saida);
		}

		scan.close();
	}

}
