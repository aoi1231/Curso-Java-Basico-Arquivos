package com.nicolas.cursojava.aula17EXRC;

import java.util.Scanner;

public class Exer48 {

	public static void main(String[] args) {
		/*
		48.Faça um programa que peça um numero inteiro positivo e em seguida mostre este
		numero invertido.
		o Exemplo:
		12376489
		=> 98467321
		
		Queria avisar que peguei com o chat gpt pois a loiane não resolveu
		essa em vídeo e eu não fazia ideia de como resolver.
		
		*/
		Scanner scan = new Scanner(System.in);

        // Solicitando o número ao usuário
        System.out.println("Digite um número inteiro positivo: ");
        int numero = scan.nextInt();

        int numeroInvertido = 0;

		// Invertendo o número
		while (numero != 0) {
			int digito = numero % 10; // Obtém o último dígito
			numeroInvertido = numeroInvertido * 10 + digito; // Adiciona o dígito ao número invertido
			numero /= 10; // Remove o último dígito do número
		}

		// Exibindo o número invertido
		System.out.println("Número invertido: " + numeroInvertido);

		scan.close();

	}

}
