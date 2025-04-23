package com.nicolas.cursojava.aula15EXRC;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		//3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual seu sexo? M-masculino, F-feminino.");
		String letra = scan.next();
		
		switch (letra) {
		case "F": System.out.println("Feminino"); break;
		case "M": System.out.println("Masculino"); break;
		default: System.out.println("Sexo Inválido");
		}
	}

}
